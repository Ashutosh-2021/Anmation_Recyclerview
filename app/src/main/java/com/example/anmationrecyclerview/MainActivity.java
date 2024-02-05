package com.example.anmationrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ContactModel> arrayList;
    ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList = new ArrayList<>();

        arrayList.add(new ContactModel(R.drawable.user, "A", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "B", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "C", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "D", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "E", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "F", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "G", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "H", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "I", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "Z", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "K", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "L", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "M", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "N", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "O", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "P", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "Q", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "R", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "S", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "T", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "U", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "V", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "W", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "X", "123498785"));
        arrayList.add(new ContactModel(R.drawable.user, "Y", "123456789"));
        arrayList.add(new ContactModel(R.drawable.user, "Z", "123498785"));

        adapter = new ContactAdapter(this, arrayList);
        recyclerView.setAdapter(adapter);

    }
}