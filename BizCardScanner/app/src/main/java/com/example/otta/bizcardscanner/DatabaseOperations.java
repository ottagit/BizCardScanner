package com.example.otta.bizcardscanner;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by otta on 6/10/15.
 */
public class DatabaseOperations extends SQLiteOpenHelper{
    public static final int DBASE_VERSION = 1;
    public String CREATE_QUERY = "CREATE TABLE " + Bizcard_Tabledata.Bizcard_TabledataInfo.TABLE_NAME + "(" + Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_NAME + " String, "
            + Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_PHONE + " int, " + Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_MAIL + " String, "
            + Bizcard_Tabledata.Bizcard_TabledataInfo.OCCUPATION + " String, " + Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_NAME + " String, "
            + Bizcard_Tabledata.Bizcard_TabledataInfo.ADDRESS + " int, " + Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_PHONE + " int, "
            + Bizcard_Tabledata.Bizcard_TabledataInfo.FAX + " int, " + Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_MAIL + " String)";;

    public DatabaseOperations(Context context) {
        super(context, Bizcard_Tabledata.Bizcard_TabledataInfo.DBASE_NAME, null, DBASE_VERSION);
        Log.d("Database Operations","Database created");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL(CREATE_QUERY);
        Log.d("Database Operations", "Database created");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
