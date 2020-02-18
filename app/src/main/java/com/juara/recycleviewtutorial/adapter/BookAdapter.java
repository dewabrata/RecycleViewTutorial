package com.juara.recycleviewtutorial.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.juara.recycleviewtutorial.R;
import com.juara.recycleviewtutorial.model.Books;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

private List<Books> bookList;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView judul, deskripsi, tanggal;
    public ImageView image;

    public MyViewHolder(View view) {
        super(view);
        judul = (TextView) view.findViewById(R.id.txtNama);
        deskripsi = (TextView) view.findViewById(R.id.txtNik);
        tanggal = (TextView) view.findViewById(R.id.txtDate);
        image = (ImageView)view.findViewById(R.id.imageView);
    }
}


    public BookAdapter(List<Books> bookList) {
        this.bookList = bookList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Books book = bookList.get(position);
        holder.judul.setText(book.getJudul());
        holder.deskripsi.setText((book.getShort_sinopsis()));
        holder.tanggal.setText(book.getPublish_date());
        Picasso.get().load(book.getImage()).into(holder.image);

    }



    @Override
    public int getItemCount() {
        return bookList.size();
    }
}