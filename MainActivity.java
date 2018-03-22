package com.example.jacka.gfgallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Girl> girlList = new ArrayList<>();
    private List<Girl> girl_for_search = new ArrayList<>();
    EditText mEDT;
    RecyclerView recyclerView;
    ChoosegirlAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initGirls();
        recyclerView = findViewById(R.id.recycler_view);
        mEDT = findViewById(R.id.edit_search);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ChoosegirlAdapter(girl_for_search);
        recyclerView.setAdapter(adapter);
        editTextSearchListener();
    }

    private void initGirls() {
        Girl no1 = new Girl("柯尔特左轮",1, "no_1", "no_1_d");
        girlList.add(no1);
        girl_for_search.add(no1);
        Girl no2 = new Girl("M1911",2, "no_2","no_2_d");
        girlList.add(no2);
        girl_for_search.add(no2);
        Girl no3 = new Girl("M9",3, "no_3", "no_3_d");
        girlList.add(no3);
        girl_for_search.add(no3);

        Girl no5 = new Girl("纳甘左轮",5, "no_5", "no_5_d");
        girlList.add(no5);
        girl_for_search.add(no5);

        Girl no6 = new Girl("托卡列夫",6, "no_6", "no_6_d");
        girlList.add(no6);
        girl_for_search.add(no6);

        Girl no7 = new Girl("斯捷奇金",7, "no7", "no7d");
        girlList.add(no7);
        girl_for_search.add(no7);

        Girl no8 = new Girl("马卡洛夫",8, "no8", "no8d");
        girlList.add(no8);
        girl_for_search.add(no8);

        Girl no9 = new Girl("P38",9, "no9", "no9d");
        girlList.add(no9);
        girl_for_search.add(no9);

        Girl no10 = new Girl("PPK",10, "no10", "no10d");
        girlList.add(no10);
        girl_for_search.add(no10);

        Girl no11 = new Girl("P08",11, "no11", "no11d");
        girlList.add(no11);
        girl_for_search.add(no11);

        Girl no12 = new Girl("C96",12, "no12", "no12d");
        girlList.add(no12);
        girl_for_search.add(no12);

        Girl no13 = new Girl("92式",13, "no13", "no13d");
        girlList.add(no13);
        girl_for_search.add(no13);

        Girl no14 = new Girl("阿斯特拉左轮",14, "no14", "no14d");
        girlList.add(no14);
        girl_for_search.add(no14);

        Girl no15 = new Girl("格洛克17",15, "no15", "no15d");
        girlList.add(no15);
        girl_for_search.add(no15);

        Girl no16 = new Girl("汤姆森",16, "no16", "no16d");
        girlList.add(no16);
        girl_for_search.add(no16);

        Girl no17 = new Girl("M3",17, "no17", "no17d");
        girlList.add(no17);
        girl_for_search.add(no17);

        Girl no18 = new Girl("MAC10",18, "no18", "no18d");
        girlList.add(no18);
        girl_for_search.add(no18);

        Girl no19 = new Girl("FMG9",19, "no19", "no19d");
        girlList.add(no19);
        girl_for_search.add(no19);

        Girl no20 = new Girl("Vector",20, "no20", "no20d");
        girlList.add(no20);
        girl_for_search.add(no20);

        Girl no21 = new Girl("PPSh41",21, "no21", "no21d");
        girlList.add(no21);
        girl_for_search.add(no21);

        Girl no22 = new Girl("PPS43",22, "no22", "no22d");
        girlList.add(no22);
        girl_for_search.add(no22);

        Girl no23 = new Girl("PP90",23, "no23", "no23d");
        girlList.add(no23);
        girl_for_search.add(no23);

        Girl no24 = new Girl("PP2000",24, "no24", "no24d");
        girlList.add(no24);
        girl_for_search.add(no24);

        Girl no25 = new Girl("MP40",25, "no25", "no25d");
        girlList.add(no25);
        girl_for_search.add(no25);

        Girl no26 = new Girl("MP5",26, "no26", "no26d");
        girlList.add(no26);
        girl_for_search.add(no26);

        Girl no27 = new Girl("蝎式",27, "no27", "no27d");
        girlList.add(no27);
        girl_for_search.add(no27);

        Girl no29 = new Girl("司登",29, "no29", "no29d");
        girlList.add(no29);
        girl_for_search.add(no29);

        Girl no31 = new Girl("伯莱塔",31, "no31", "no31d");
        girlList.add(no31);
        girl_for_search.add(no31);

        Girl no32 = new Girl("微型乌兹",32, "no32", "no32d");
        girlList.add(no32);
        girl_for_search.add(no32);

        Girl no33 = new Girl("M45",33, "no33", "no33d");
        girlList.add(no33);
        girl_for_search.add(no33);

        Girl no34 = new Girl("M1加兰德",34, "no34", "no34d");
        girlList.add(no34);
        girl_for_search.add(no34);

        Girl no35 = new Girl("M1A1",35, "no35", "no35d");
        girlList.add(no35);
        girl_for_search.add(no35);

        Girl no36 = new Girl("春田",36, "no36", "no36d");
        girlList.add(no36);
        girl_for_search.add(no36);

        Girl no37 = new Girl("M14",37, "no37", "no37d");
        girlList.add(no37);
        girl_for_search.add(no37);

        Girl no38 = new Girl("M21",38, "no38", "no38d");
        girlList.add(no38);
        girl_for_search.add(no38);

        Girl no39 = new Girl("莫辛纳甘",39, "no39", "no39d");
        girlList.add(no39);
        girl_for_search.add(no39);

        Girl no40 = new Girl("SVT38",40, "no40", "no40d");
        girlList.add(no40);
        girl_for_search.add(no40);

        Girl no41 = new Girl("西蒙诺夫",41, "no41", "no41d");
        girlList.add(no41);
        girl_for_search.add(no41);

        Girl no42 = new Girl("PTRD",42, "no42", "no42d");
        girlList.add(no42);
        girl_for_search.add(no42);

        Girl no43 = new Girl("SVD",43, "no43", "no43d");
        girlList.add(no43);
        girl_for_search.add(no43);

        Girl no44 = new Girl("SV98",44, "no44", "no44d");
        girlList.add(no44);
        girl_for_search.add(no44);

        Girl no46 = new Girl("Kar98k",46, "no46", "no46d");
        girlList.add(no46);
        girl_for_search.add(no46);

        Girl no47 = new Girl("G43",47, "no47", "no47d");
        girlList.add(no47);
        girl_for_search.add(no47);

        Girl no48 = new Girl("WA2000",48, "no48", "no48d");
        girlList.add(no48);
        girl_for_search.add(no48);

        Girl no49 = new Girl("56半",49, "no49", "no49d");
        girlList.add(no49);
        girl_for_search.add(no49);

        Girl no50 = new Girl("李恩菲尔德",50, "no50", "no50d");
        girlList.add(no50);
        girl_for_search.add(no50);

    }

    private void search() {
        String girl_name = mEDT.getText().toString().trim();
        girl_for_search.clear();

        for (int i = 0; i < girlList.size(); i++) {
            Girl girl = girlList.get(i);
            String girl_name2 = girl.getName();
            if (girl_name2.contains(girl_name)) {
                girl_for_search.add(girl);
            }
        }

        adapter.notifyDataSetChanged();
    }

    private void editTextSearchListener() {
        mEDT.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                search();
            }
        });
    }
}
