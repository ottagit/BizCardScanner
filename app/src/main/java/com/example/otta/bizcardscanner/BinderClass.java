package com.example.otta.bizcardscanner;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

/**
 * Created by otta on 6/15/15.
 */
public class BinderClass extends ListActivity {
    SQLiteDatabase db;
    DatabaseOperations dob;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.binderclass);
        dob = new DatabaseOperations(this);
        db = dob.getWritableDatabase();
        lv.getListView();

        final String[] from = {Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_NAME, String.valueOf(Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_PHONE)
               , Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_NAME, Bizcard_Tabledata.Bizcard_TabledataInfo.ADDRESS
                , String.valueOf(Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_PHONE), String.valueOf(Bizcard_Tabledata.Bizcard_TabledataInfo.FAX)
                ,Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_MAIL};
        final String[] column = {Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_MAIL, Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_NAME, String.valueOf(Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_PHONE)
                , Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_NAME, Bizcard_Tabledata.Bizcard_TabledataInfo.ADDRESS
                , String.valueOf(Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_PHONE), String.valueOf(Bizcard_Tabledata.Bizcard_TabledataInfo.FAX)
                ,Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_MAIL} ;

        final int[] to = {};
        Cursor cursor = db.query(Bizcard_Tabledata.Bizcard_TabledataInfo.TABLE_NAME, column, null, null, null, null, null);
        SimpleCursorAdapter sca = new SimpleCursorAdapter(this, R.layout.binderclass, cursor, from, to);
        setListAdapter(sca);

        //move to first row

        cursor.moveToFirst();
        //move to next row
            while (cursor.moveToNext())

                //get String and column index from cursor
            {
                String name = cursor.getString(cursor.getColumnIndex(Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_NAME));
                String title = cursor.getString(cursor.getColumnIndex(Bizcard_Tabledata.Bizcard_TabledataInfo.OCCUPATION));
                String mobile = cursor.getString(cursor.getColumnIndex(String.valueOf(Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_PHONE)));

                Toast.makeText(this, "Name: " + name + " Title: " +  title + " Mobile: " + mobile, Toast.LENGTH_SHORT).show();
                cursor.close();
            }

        }


    }

