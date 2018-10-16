package com.example.boylc.demomvp.data.source;

import com.example.boylc.demomvp.data.model.Category;

import java.util.ArrayList;

public interface CategoryDataSource {
    interface RemoteDataSource {
        void getCategories(CallBack<ArrayList<Category>> callBack);
    }

    interface LocalDataSource {
    }
}
