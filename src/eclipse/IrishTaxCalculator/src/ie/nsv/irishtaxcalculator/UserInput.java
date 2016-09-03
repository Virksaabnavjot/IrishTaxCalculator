package ie.nsv.irishtaxcalculator;

/**
 * @author Navjot
 * Website: https://www.Navsingh.org.uk and http://www.Nsv.ie
 * Date: 03/09/2016
 * Time: 19:56 pm
 **/

import android.os.Bundle;
import android.widget.Toast;
import android.app.Activity;

public class UserInput extends Activity {
	TaxRates taxRates = new TaxRates();
	USCRates uscRates = new USCRates();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_input);
		Toast.makeText(this, Double.toString(uscRates.USCRate(13.00)),
		Toast.LENGTH_LONG).show();
	}

}
