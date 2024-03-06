package com.example.hello_android_app_k15pm01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hello_android_app_k15pm01.entities.Product;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        put data list to productListView
        ListView listView = findViewById(R.id.productListview);

        List<Product> dataList = Arrays.asList(
                new Product(700, "Samsung galaxy s3", "p1.jpg"),
                new Product(200, "Iphone pro max 2024", "p2.jpg")
        );
        ArrayAdapter <Product> adapter = new ArrayAdapter<Product>(this, android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(adapter);
    }
}