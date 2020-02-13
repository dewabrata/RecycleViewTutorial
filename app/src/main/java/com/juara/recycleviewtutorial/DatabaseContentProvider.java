package com.juara.recycleviewtutorial;

import com.activeandroid.Configuration;
import com.activeandroid.content.ContentProvider;

import com.juara.recycleviewtutorial.model.Mahasiswa;

public class DatabaseContentProvider extends ContentProvider {

    @Override
    protected Configuration getConfiguration() {
        Configuration.Builder builder = new Configuration.Builder(getContext());
        builder.addModelClass(Mahasiswa.class);

        return builder.create();
    }
}