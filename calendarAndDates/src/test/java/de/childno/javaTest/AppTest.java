package de.childno.javaTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testLocal()
    {
        App testApp = new App();
        assertTrue(true);
    }

    public void testGmt()
    {
        App testApp = new App("GMT");
        assertTrue(true);
    }

    public void testSdf()
    {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        System.out.println("current Time in GMT: " + sdf.format(new java.util.Date()));
        assertTrue(true);
    }

    public void testSdfDateToDate()
    {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        // from TZ
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("Europe/Berlin"));
        String fromDate = String.valueOf(sdf.format((new java.util.Date()).getTime()));
        System.out.println("convert from: " + fromDate);
        // to TZ
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        java.util.Date parsedDate = null;
        try {
            parsedDate = sdf.parse(fromDate);
        }
        catch (java.text.ParseException e) {
            fail(e.getMessage());
        }
        System.out.println("converted to date: "+ parsedDate);
        assertTrue(true);
    }
}
