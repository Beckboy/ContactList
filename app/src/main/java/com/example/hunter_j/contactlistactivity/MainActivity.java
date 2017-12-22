package com.example.hunter_j.contactlistactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.hunter_j.contactlistactivity.entity.ClassGroupChatDetailsDTO;
import com.example.hunter_j.contactlistactivity.entity.ClassGroupChatDetailsEntity;
import com.example.hunter_j.contactlistactivity.view.EaseContactList;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EaseContactList contactlist;

    private ClassGroupChatDetailsDTO persons = new ClassGroupChatDetailsDTO();

    private String[] strName = new String[]{"张三","李四","王二麻子","跳大神的","巫妖王"};
    private String[] strOrig = new String[]{"百度","阿里","腾讯","谷歌","苹果"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        initView();
        
    }

    private void initData() {
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int num = random.nextInt(5);
            ClassGroupChatDetailsEntity entity = new ClassGroupChatDetailsEntity();
            entity.nickname = strName[num];
            entity.org = strOrig[num];
            persons.memberlist.add(entity);
        }
    }


    private void initView() {
        contactlist = (EaseContactList) findViewById(R.id.contact_list);
        contactlist.init(persons.memberlist);
    }
}
