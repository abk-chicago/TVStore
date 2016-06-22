package com.andreakim.tvstore;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by andreakim on 6/22/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    public static final int DB_VERSION = 1;   // all caps syntax is only for finals, very important; change as we upgrade
    public static final String DB_NAME = "store.db";  // name of your .db
    public static final String CREATE_TABLE = "CREATE TABLE televisions (id INT PRIMARY KEY, name TEXT);";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS sequels;";


    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }

    public void seedDatabase() {

        insertTv(1,"sony","24 inch",120);
        insertTv(2,"panasonic","24 inch",140);
        insertTv(3,"sharp","24 inch",110);
        insertTv(4,"sony","49 inch",350);
        insertTv(5,"ge","36 inch",220);
        
        //sample data
    }

    public void insertTv(int id, String brand, String size, int price) {
        SQLiteDatabase db = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("id",id);
        values.put("brand", brand);
        values.put("size", size);
        values.put("price", price);
        db.insert("televisions",null,values);

    }


}
