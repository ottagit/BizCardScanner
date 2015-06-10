package com.example.otta.bizcardscanner;

import android.provider.BaseColumns;

/**
 * Created by otta on 6/10/15.
 */
public class Bizcard_Tabledata {
    public Bizcard_Tabledata()
    {

    }

    public static abstract class Bizcard_TabledataInfo implements BaseColumns{
       public static final String HOLDER_NAME = "card_holder";
       public static final int HOLDER_PHONE = 0712354612;
       public static final String HOLDER_MAIL = "myemail@domain.com";
       public  static final String OCCUPATION = "default_occupant";
       public static final String COMPANY_NAME = "company_name";
       public static final String ADDRESS = "default_address";
       public static final int COMPANY_PHONE = 123456789;
       public static final int FAX = 987654321;
       public static  final String COMPANY_MAIL = "company@domain.com";
       public static final String DBASE_NAME = "card_info";
       public static final String TABLE_NAME = "holder_info";


    }
}
