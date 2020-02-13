package com.juara.recycleviewtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juara.recycleviewtutorial.adapter.BookAdapter;
import com.juara.recycleviewtutorial.model.Books;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BookAdapter ba;
    RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc = findViewById(R.id.listData);

        List<Books>  data = new ArrayList<Books>();

        Books buku = new Books();
        buku.setJudul("Harry Pothead");
        buku.setShort_sinopsis("Penyihir cilik");
        buku.setSinopsis("Penmihir cilik di desa KKN");
        buku.setPublish_date("14-02-2020");
        buku.setImage("https://storage.trubus.id/storage/app/public/posts/t20180906/big_5f1a75985a6ce850dbf0fbc95e69ba350a3e5e4c.png");

        data.add(buku);

        buku = new Books();
        buku.setJudul("Jurrasic Park");
        buku.setShort_sinopsis("Dinasaurus");
        buku.setSinopsis("Binatang Gede");
        buku.setPublish_date("20-02-2020");
        buku.setImage("https://cdn.idntimes.com/content-images/community/2019/07/jw2-adv1sheet-trex-2-preview-rgb-220508902f652ee1486a1bc2200e7b07_600x400.jpg");
        data.add(buku);



        ba = new BookAdapter(data);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rc.setLayoutManager(mLayoutManager);
        rc.setItemAnimator(new DefaultItemAnimator());
        rc.setAdapter(ba);
    }
}
