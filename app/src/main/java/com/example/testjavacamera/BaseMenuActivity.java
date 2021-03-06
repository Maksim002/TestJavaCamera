package com.example.testjavacamera;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;


public abstract class BaseMenuActivity extends AppCompatActivity {

    private List<MenuListItem> mListItems;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);
        TextView titleTxt = findViewById(R.id.txtTitle);
        titleTxt.setText(getTitleText());

        mListItems = createMenuListItems();
        ListView lv = findViewById(R.id.detectorList);
        ArrayAdapter<MenuListItem> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mListItems);
        lv.setAdapter(listAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mListItems.get(position).getOnClickAction().run();
            }
        });
    }

    protected abstract List<MenuListItem> createMenuListItems();

    protected abstract String getTitleText();

}
