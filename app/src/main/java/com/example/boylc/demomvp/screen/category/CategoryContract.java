package com.example.boylc.demomvp.screen.category;

import com.example.boylc.demomvp.data.model.Category;
import com.example.boylc.demomvp.screen.base.BasePresenter;

import java.util.ArrayList;

public class CategoryContract {
    public interface View{
        void onGetDataSuccess(ArrayList<Category> data);
        void hideProgressBar();
        void showToast(String string);
    }
    public interface Presenter extends BasePresenter<View>{
        void getCategories();
    }
}
