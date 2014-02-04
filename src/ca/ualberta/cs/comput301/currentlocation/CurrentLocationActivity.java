package ca.ualberta.cs.comput301.currentlocation;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;

public class CurrentLocationActivity extends Activity {
	private static final String GPS_MOCK_PROVIDER = "GpsMockProvider";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		// Obtain LocationManager service and set up location update request.
		// To Do
	}

	
	// Retrieve location updates through LocationListener interface
	private final LocationListener locationListener = new LocationListener(){
	// To Do: override the four methods.
	}	

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
