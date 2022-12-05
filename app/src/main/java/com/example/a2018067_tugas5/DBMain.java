package com.example.a2018067_tugas5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import android.view.View;
import android.content.Context;
import android.content.Intent;

public class DBMain extends SQLiteOpenHelper {
    public static final String DBNAME="olehHaji.db";
    public static final String TABLENAME="tradisional";
    public static final int VER=1;
    public DBMain(@Nullable Context context) {
                super(context, DBNAME, null, VER);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table "+TABLENAME+"(id integer primary key, name TEXT, star TEXT, price TEXT, avatar blob)";
        db.execSQL(query);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int
            newVersion) {
        String query = "drop table if exists "+TABLENAME+"";
        db.execSQL(query);
        onCreate(db);
    }
}