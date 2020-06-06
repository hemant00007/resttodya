
package com.example.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("StatusCode")
    @Expose
    private String statusCode;
    @SerializedName("Usid")
    @Expose
    private String usid;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

}
