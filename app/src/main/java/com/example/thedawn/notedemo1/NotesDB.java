package com.example.thedawn.notedemo1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by The dawn on 2017/5/14.
 */

public class NotesDB extends SQLiteOpenHelper {
    public static final String TABLE_NAME = "notes";
    public static final String CONTENT = "content";
    public static final String PATH = "path";
    public static final String VIDEO = "video";
    public static final String ID = "_id";
    public static final String TIME = "time";

    public NotesDB(Context context) {
        super(context, "notes",null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME+"("
                +ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
                +CONTENT+" TEXT,"
                +PATH+" TEXT,"
                +VIDEO+" TEXT,"
                +TIME+" TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
