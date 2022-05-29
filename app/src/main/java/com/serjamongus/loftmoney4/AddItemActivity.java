package com.serjamongus.loftmoney4;

import android.os.Bundle;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputEditText;


public class AddItemActivity extends AppCompatActivity {

    private static final String KEY_PRICE = "price";
    private static final String KEY_TITLE = "title";

    private TextInputEditText titleEditText;
    private TextInputEditText priceEditText;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);}


}