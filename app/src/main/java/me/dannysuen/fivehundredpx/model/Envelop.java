package me.dannysuen.fivehundredpx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by danny on 16-7-26.
 */
public class Envelop {

    @SerializedName("current_page")
    public int currentPage;

    @SerializedName("total_pages")
    public int totalPages;

    @SerializedName("total_items")
    public int totalItems;

    @SerializedName("photos")
    public List<Photo> photos;
}
