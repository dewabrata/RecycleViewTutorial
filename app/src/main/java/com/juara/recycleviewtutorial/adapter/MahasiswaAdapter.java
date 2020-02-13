package com.juara.recycleviewtutorial.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.juara.recycleviewtutorial.R;
import com.juara.recycleviewtutorial.model.Mahasiswa;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MyViewHolder> {

private List<Mahasiswa> bookList;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView nama, nik, tanggal;
    public ImageView image;

    public MyViewHolder(View view) {
        super(view);
        nama = (TextView) view.findViewById(R.id.txtNama);
        nik = (TextView) view.findViewById(R.id.txtNik);
        tanggal = (TextView) view.findViewById(R.id.txtDate);
     //   image = (ImageView)view.findViewById(R.id.imageView);
    }
}


    public MahasiswaAdapter(List<Mahasiswa> bookList) {
        this.bookList = bookList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mhs_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Mahasiswa mhs = bookList.get(position);
        holder.nama.setText(mhs.getNama());
        holder.nik.setText((mhs.getNik()));
        holder.tanggal.setText(mhs.getTglLahir());
     //   Picasso.get().load(mhs.getImage()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}