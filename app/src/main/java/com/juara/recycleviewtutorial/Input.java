package com.juara.recycleviewtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.juara.recycleviewtutorial.model.Mahasiswa;

public class Input extends AppCompatActivity {

    EditText txtNama,txtNik,txtTanggal;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        txtNama = findViewById(R.id.txtNama);
        txtNik = findViewById(R.id.txtNik);
        txtTanggal = findViewById(R.id.txtTanggal);
        btnSave = findViewById(R.id.btnSave);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(txtNama.getText().toString());
                mhs.setNik(txtNik.getText().toString());
                mhs.setTglLahir(txtTanggal.getText().toString());
                mhs.save();
                finish();
            }
        });
    }
}
