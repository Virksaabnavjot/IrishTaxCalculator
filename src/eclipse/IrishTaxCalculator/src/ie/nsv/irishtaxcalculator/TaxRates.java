package ie.nsv.irishtaxcalculator;

public class TaxRates {
	double standardRateOfTax;
	double higherRateOfTax;
	
	public TaxRates() {
		standardRateOfTax = 20.00;
		higherRateOfTax = 40.00;
	}
	
	public double standard() {
		return standardRateOfTax;
	}
	
	public double higher() {
		return higherRateOfTax;
	}
	
}
