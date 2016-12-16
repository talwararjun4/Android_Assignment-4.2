package com.talwararjun4.acadgild_android_assignment11;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.talwararjun4.acadgild_android_assignment11.ListPOJO;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    CustomListPOJOAdapter customListPOJOAdapter =null;
    List<ListPOJO> listDisplay = null;
    ListView listView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListData();
        listView = (ListView) findViewById(R.id.listView1);
        Resources res = getResources();
        customListPOJOAdapter = new CustomListPOJOAdapter(this,listDisplay,res);
        listView.setAdapter(customListPOJOAdapter);
    }

    public void setListData(){
        listDisplay = new ArrayList<ListPOJO>();
        for(int i=1;i<=10;i++){
            ListPOJO listPOJO = new ListPOJO();
            listPOJO.setName("Name "+i);
            listPOJO.setPhoneNumber("Phone Number "+i);

            listDisplay.add(listPOJO);
        }
    }
}
