package com.org.mvn;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class) // suite-- collection of all test cases
@Suite.SuiteClasses({New.class,Different.class})
public class Merge {
    public static void main(String[] args) {
    	Result rs = JUnitCore.runClasses(New.class,Different.class);
    	System.out.println(rs.getFailureCount());
    	System.out.println(rs.getIgnoreCount());
    	System.out.println(rs.getRunCount());
    	System.out.println(rs.getRunTime());
    	System.out.println(rs.wasSuccessful());
    	
    	List<Failure> failures = rs.getFailures();
    	for (Failure failure : failures) {
			System.out.println(failure);
		}
    	
	}
	
	
	
}
