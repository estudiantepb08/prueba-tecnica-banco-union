package com.banco.union.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate implements IFormatDate{
	
	@Override
	public Date parseDate(String stringDate)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(stringDate);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return date;
    }

}
