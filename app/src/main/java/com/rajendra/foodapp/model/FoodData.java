
package com.rajendra.foodapp.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodData {

    @SerializedName("popular")
    @Expose
    private List<Popular> popular = null;
    @SerializedName("recommended")
    @Expose
    private List<Recommended> recommended = null;
    @SerializedName("allmenu")
    @Expose
    private List<Allmenu> allmenu = null;

    public List<Popular> getPopular() {
        return popular;
    }

    public void setPopular(List<Popular> popular) {
        this.popular = popular;
    }

    public List<Recommended> getRecommended() {
        return recommended;
    }

    public void setRecommended(List<Recommended> recommended) {
        this.recommended = recommended;
    }

    public List<Allmenu> getAllmenu() {
        return allmenu;
    }

    public void setAllmenu(List<Allmenu> allmenu) {
        this.allmenu = allmenu;
    }

}
