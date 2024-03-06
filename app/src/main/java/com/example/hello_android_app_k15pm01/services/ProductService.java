package com.example.hello_android_app_k15pm01.services;

import com.example.hello_android_app_k15pm01.entities.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductService {
//    Tạo 1 hàm lấy tất cả sản phẩm, trả về kiểu Call, Call kiểu list Product

    @GET("/rest/products")
     Call<List<Product>> getAllProducts();

}
