package de.childno.javaTest;

import java.util.Calendar;

public class App 
{
    protected long curDate;

    public static void main( String[] args )
    {
        System.out.println("needs args");
    }

    App()
    {
        curDate = Calendar.getInstance().getTime().getTime();
    }
}
