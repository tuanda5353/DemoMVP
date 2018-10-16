package com.example.boylc.demomvp.data.source.remote;

import com.example.boylc.demomvp.data.model.Category;
import com.example.boylc.demomvp.data.source.CallBack;
import com.example.boylc.demomvp.untils.Constants;

import java.util.ArrayList;

public class RemoteDataSource {
    private void getCategoriesFromApi(CallBack<ArrayList<Category>> callBack) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Constants.Api.BASE_URL)
                .append(Constants.Api.LIST_CATEGORY);
        String url = stringBuilder.toString();
        new CategoryRemoteAsyncTask(callBack).execute(url);
    }

    public void getCategories(CallBack<ArrayList<Category>> callBack) {
        getCategoriesFromApi(callBack);
    }
}
