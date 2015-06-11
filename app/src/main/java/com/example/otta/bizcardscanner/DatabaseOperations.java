package com.example.otta.bizcardscanner;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by otta on 6/10/15.
 */
public class DatabaseOperations extends SQLiteOpenHelper{
    public static final int DB_VERSION = 1;
    public String CREATE_QUERY = "CREATE TABLE " + Bizcard_Tabledata.Bizcard_TabledataInfo.TABLE_NAME + "(" + Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_NAME + " String, "
            + Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_PHONE + " int, " + Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_MAIL + " String, "
            + Bizcard_Tabledata.Bizcard_TabledataInfo.OCCUPATION + " String, " + Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_NAME + " String, "
            + Bizcard_Tabledata.Bizcard_TabledataInfo.ADDRESS + " int, " + Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_PHONE + " int, "
            + Bizcard_Tabledata.Bizcard_TabledataInfo.FAX + " int, " + Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_MAIL + " String)";;

    public DatabaseOperations(Context context) {
        super(context, Bizcard_Tabledata.Bizcard_TabledataInfo.DBASE_NAME, null, DB_VERSION);
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

    public void loadInfo(DatabaseOperations dob, String holder_name, int mobile, String holder_email, String position, String co_name,
      String address, int co_phone, int fax, String co_mail)
    {
        SQLiteDatabase sqlt = dob.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_NAME, holder_name);
        cv.put(String.valueOf(Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_PHONE), mobile);
        cv.put(Bizcard_Tabledata.Bizcard_TabledataInfo.HOLDER_MAIL, holder_email);
        cv.put(Bizcard_Tabledata.Bizcard_TabledataInfo.OCCUPATION, position);
        cv.put(Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_NAME, co_name);
        cv.put(Bizcard_Tabledata.Bizcard_TabledataInfo.ADDRESS, address);
        cv.put(String.valueOf(Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_PHONE), co_phone);
        cv.put(String.valueOf(Bizcard_Tabledata.Bizcard_TabledataInfo.FAX), fax);
        cv.put(Bizcard_Tabledata.Bizcard_TabledataInfo.COMPANY_MAIL, co_mail);

        long insertion = sqlt.insert(Bizcard_Tabledata.Bizcard_TabledataInfo.TABLE_NAME, null, cv);
        Log.d("Database Operations", "One record added");
    }
}
