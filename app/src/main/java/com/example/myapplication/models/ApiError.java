package com.example.myapplication.models;

import com.google.gson.annotations.SerializedName;

public class ApiError {

    @SerializedName("title")
    public String title;
    @SerializedName("description")
    public String description;

}
