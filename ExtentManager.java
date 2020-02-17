package com.extendreports;
import com.relevantcodes.extentreports.ExtentReports;
public class ExtentManager {
	 
	    private static ExtentReports extent;
	 
	    public  synchronized static ExtentReports getReporter()
         {
	        if(extent == null)
	        {
	            //Set HTML reporting file location
	            String workingDir = System.getProperty("user.dir");
	            extent = new ExtentReports("./ExtentReports/ExtentReportResults.html");
	        }
	        return extent;
	    }
	}


