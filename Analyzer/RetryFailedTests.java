package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class RetryFailedTests implements IRetryAnalyzer{
	int maxcount=3;
	int retry=0;
	public boolean retry(ITestResult result) {		
				if(retry<maxcount)
					{
					retry++;
					return true;
					}
		return false;
	}
	
	

}
