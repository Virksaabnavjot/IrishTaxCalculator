package ie.nsv.irishtaxcalculator;

public class USCRates {
	double USCRate;
    double USCCharge;
	
    public double USCRate(double income) {
 
    	if(income <= 12012.00) {
    		USCRate = 1.0;
    	}else if(income > 12012.00 && income <= 18668.00){
    		USCRate = 3.0;
    	}else if(income > 18668.00 && income <= 70044.00){
    		USCRate = 5.5;
    	}else{
    		USCRate = 8.0;
    	}
    	
    	return USCRate;
	}
    
    public void calculateUSCCharge() {
    //continue here
    }
    
	public double getUSCCharge() {
		return USCCharge;
	}
}
