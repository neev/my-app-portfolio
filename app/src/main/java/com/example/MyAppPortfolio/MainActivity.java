package com.example.MyAppPortfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void spotify_clk(View view){

        CharSequence message = "This button will lunch my spotify streamer app!";

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }
    public void scores_clk(View view){

        CharSequence message = "This button will lunch my scores app!";

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
    public void library_clk(View view){

        CharSequence message = "This button will lunch my library app!";

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
    public void builditbigger_clk(View view){

        CharSequence message = "This button will lunch my build it bigger app!";

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
    public void xyzreader_clk(View view){

        CharSequence message = "This button will lunch my xyz reader app!";

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

    }
    public void capstone_clk(View view){

        CharSequence message = "This button will lunch my capstone app!";

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
