package com.example.boylc.demomvp.data.repository;

import com.example.boylc.demomvp.data.model.Category;
import com.example.boylc.demomvp.data.source.CallBack;
import com.example.boylc.demomvp.data.source.CategoryDataSource;
import com.example.boylc.demomvp.data.source.remote.RemoteDataSource;

import java.util.ArrayList;

public class CategoryRepository implements CategoryDataSource.RemoteDataSource,CategoryDataSource.LocalDataSource {
    private RemoteDataSource mRemoteDataSource;

    public CategoryRepository(RemoteDataSource remoteDataSource) {
        mRemoteDataSource = remoteDataSource;
    }

    @Override
    public void getCategories(CallBack<ArrayList<Category>> callBack) {
        mRemoteDataSource.getCategories(callBack);
    }
}
