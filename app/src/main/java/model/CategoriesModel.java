package model;

import android.content.Intent;

public class CategoriesModel {
    String text;

    public CategoriesModel(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
