package com.bullapse.WhereIsMyBus;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;


public class HomeActivity extends ActionBarActivity {

    public final static String TIME = "com.bullapse.WhereIsMyBus.TIME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * This is what will happen when the button is pressed on the Home activity
     * @param view
     */
    public void findBus(View view) {
        Intent intent = new Intent(this, ShowTimesActivity.class );
        //This is where we find the times of the Bus for the next 2 hours
        //Limit
        String message = findBusTimeHelper();
        intent.putExtra(TIME, message);
        startActivity(intent);

    }

    /**
     * This method will fetch the data from CAP METRO website
     * @return
     */
    public String findBusTimeHelper() {
        String message;
        message = "7:30";
        return message;
    }

}
