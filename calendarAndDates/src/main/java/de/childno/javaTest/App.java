package de.childno.javaTest;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import java.text.SimpleDateFormat;

public class App 
{
    protected Calendar curCal;
    protected Date curDate;
    protected long curTimestamp;

    public static void main( String[] args )
    {
        System.out.println("needs args");
    }

    App()
    {
        curCal = Calendar.getInstance();
        curDate = curCal.getTime();
        curTimestamp = curDate.getTime();
        this.print();
    }

    App(String pTimeZoneName)
    {
        curCal = Calendar.getInstance(TimeZone.getTimeZone(pTimeZoneName));
        curDate = curCal.getTime();
        curTimestamp = curDate.getTime();
        this.print();
    }

    protected void print() {
        System.out.println(this.curTimestamp);
        System.out.println("Date Object:" + curDate);

        SimpleDateFormat sdf = new SimpleDateFormat("hh:MM:ss: a Z");
        sdf.setTimeZone(curCal.getTimeZone());
        System.out.println(sdf.format(curDate));
        System.out.println(sdf.format(curTimestamp));
    }
}
