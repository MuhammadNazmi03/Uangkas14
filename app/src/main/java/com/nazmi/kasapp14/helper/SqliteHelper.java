package com.nazmi.kasapp14.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.sql.SQLClientInfoException;

public class SqliteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "uang_kas";
    private static final int DATABASE_VERSION = 1;

    public SqliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String table = "CREATE TABLE transaksi (" +
                "transaksi_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "jumlah DOUBLE," +
                "keterangan TEXT," +
                "tanggal DATE DEFAULT CURRENT_DATE);";

        db.execSQL(table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS transaksi");
    }
}
