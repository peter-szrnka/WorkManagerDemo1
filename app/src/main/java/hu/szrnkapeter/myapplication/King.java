package hu.szrnkapeter.myapplication;

public class King {
    private long id;
    private String nm;
    private String cty;
    private String hse;
    private String yrs;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getHse() {
        return hse;
    }

    public void setHse(String hse) {
        this.hse = hse;
    }

    public String getYrs() {
        return yrs;
    }

    public void setYrs(String yrs) {
        this.yrs = yrs;
    }

    @Override
    public String toString() {
        return "King{" +
                "id=" + id +
                ", nm='" + nm + '\'' +
                ", cty='" + cty + '\'' +
                ", hse='" + hse + '\'' +
                ", yrs='" + yrs + '\'' +
                '}';
    }
}
