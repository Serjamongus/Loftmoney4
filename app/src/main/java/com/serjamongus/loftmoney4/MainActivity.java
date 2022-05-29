package com.serjamongus.loftmoney4;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.serjamongus.loftmoney4.models.MoneyItem;

public class MainActivity extends AppCompatActivity {

    private static String title;
    private RecyclerView itemsView;

    private static final String KEY_PRICE= "price";
    private static final String KEY_TITLE = "title";
    private static final int ADD_ITEM_REQUEST_CODE = 100;

    private MoneyItemsAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(v ->
                startActivityForResult(
                        new Intent(MainActivity.this, AddItemActivity.class), ADD_ITEM_REQUEST_CODE));

        RecyclerView recyclerView = findViewById(R.id.items_list);

        mAdapter = new MoneyItemsAdapter();
        recyclerView.setAdapter(mAdapter);

        mAdapter.addItem(new MoneyItem("Coffee", 300));
        mAdapter.addItem(new MoneyItem("Межконтинентальная баллистическая ракета", 5_000_000_00));
    }

        @Override
        protected void onActivityResult ( final int requestCode, final int resultCode,
        @Nullable final Intent data)
        {
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == ADD_ITEM_REQUEST_CODE && resultCode == RESULT_OK)
                if (data != null)
                mAdapter.addItem(
                        new MoneyItem(
                                data.getStringExtra(KEY_TITLE),
                                Integer.parseInt(data.getStringExtra(KEY_PRICE))
                        )
                );
        }

    }







