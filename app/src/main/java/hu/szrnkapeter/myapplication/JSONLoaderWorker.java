package hu.szrnkapeter.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import androidx.work.Worker;
import androidx.work.WorkerParameters;
import retrofit2.Response;

public class JSONLoaderWorker extends Worker {

    // (1) Add the endpoint as a private class variable
    private GetDataService endpointService;

    JSONLoaderWorker(
            @NonNull Context context,
            @NonNull WorkerParameters params) {
        super(context, params);
        // (2) Initialize the variable with the RetrofitClient
        endpointService = RetrofitClient.getInstance(context).getRetrofit().create(GetDataService.class);
    }

    @Override
    @NonNull
    public Result doWork() {
        Log.i(Config.LOG_TAG, "Worker started");
        try {
            // (3) Call the endpoint
            Response<List<King>> response = endpointService.listKings().execute();
            List<King> resultList = response.body();
            if(resultList != null) {
                for(King king : resultList) {
                    Log.d(Config.LOG_TAG, king.toString());
                }
            }
        } catch (IOException e) {
            Log.e(Config.LOG_TAG, "Exception occured: " + e.getLocalizedMessage());
            e.printStackTrace();
            return Result.failure();
        }
        return Result.success();
    }
}
