package com.example.madhu.kishann;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by madhu on 7/2/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private  static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="contacts.db";
    private static final String TABLE_NAME="contacts";
    private static final String COLUMN_ID="id";
    private static final String COLUMN_USERNAME="name";
    private static final String COLUMN_PASSWORD="password";
    SQLiteDatabase db;
    private static final String CREATE_TABLE="create table contacts (name text not null ,password text not null);";
    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        this.db=db;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query="DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }
    public void insertContact(Contact c){
        db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
       values.put(COLUMN_USERNAME,c.getUsername());
        values.put(COLUMN_PASSWORD,c.getPassword());
        db.insert(TABLE_NAME , null , values);
    }
    public Boolean searchPass(String emaail,String pasword)

    {
        db=this.getReadableDatabase();
        String query = "select name, password from " + TABLE_NAME ;
        Cursor cursor=db.rawQuery(query,null);
        String em,pw;
        Boolean flag=false;
        if(cursor.moveToFirst()) {
            do{
                em=cursor.getString(0);
                pw=cursor.getString(1);
                if(em.equals(emaail) && pw.equals(pasword))
                {
                    flag=true;
                    break;
                }

            } while(cursor.moveToNext());


        }

        return flag;



    }
    public Boolean searching(String mad){
       db=this.getReadableDatabase();
        String query = "select name from " + TABLE_NAME ;
        Cursor c=db.rawQuery(query,null);
        String ak;
        Boolean flag=true;
        if(c.moveToFirst()){
            do{
                ak=c.getString(0);
                if(ak.equals(mad)){
                    flag=false;
                    break;
                }

            }while (c.moveToNext());
        }
        return flag;
    }
}
