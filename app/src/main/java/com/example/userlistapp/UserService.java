package com.example.userlistapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {
    @GET("users") // endpoint API của bạn, sửa theo URL thực tế nếu cần
    Call<List<User>> getUsers();
}
