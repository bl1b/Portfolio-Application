package de.gruenewald.udacity.portfolioapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import de.gruenewald.udacity.portfolioapp.R;

public class PortfolioActivity extends AppCompatActivity implements View.OnClickListener {
    final static String LOG_TAG = "PortfolioActivity";

    Button mSpotifyButton;
    Button mScoresButton;
    Button mLibButton;
    Button mBiggerButton;
    Button mXyzButton;
    Button mCapstoneButton;
    Toast mActiveToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        mSpotifyButton = (Button) findViewById(R.id.portfolio_button_spotify);
        mSpotifyButton.setOnClickListener(this);

        mScoresButton = (Button) findViewById(R.id.portfolio_button_scores);
        mScoresButton.setOnClickListener(this);

        mLibButton = (Button) findViewById(R.id.portfolio_button_libapp);
        mLibButton.setOnClickListener(this);

        mBiggerButton = (Button) findViewById(R.id.portfolio_button_builditbigger);
        mBiggerButton.setOnClickListener(this);

        mXyzButton = (Button) findViewById(R.id.portfolio_button_xyz);
        mXyzButton.setOnClickListener(this);

        mCapstoneButton = (Button) findViewById(R.id.portfolio_button_capstone);
        mCapstoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(LOG_TAG, "Click registered.");
        switch (v.getId()) {
            case R.id.portfolio_button_spotify:
                if(mActiveToast != null) {
                    mActiveToast.cancel();
                }
                mActiveToast = Toast.makeText(this, R.string.portfolio_button_spotify_toast, Toast.LENGTH_SHORT);
                mActiveToast.show();
                break;
            case R.id.portfolio_button_scores:
                if(mActiveToast != null) {
                    mActiveToast.cancel();
                }
                mActiveToast = Toast.makeText(this, R.string.portfolio_button_scores_toast, Toast.LENGTH_SHORT);
                mActiveToast.show();
                break;
            case R.id.portfolio_button_libapp:
                if(mActiveToast != null) {
                    mActiveToast.cancel();
                }
                mActiveToast = Toast.makeText(this, R.string.portfolio_button_libapp_toast, Toast.LENGTH_SHORT);
                mActiveToast.show();
                break;
            case R.id.portfolio_button_builditbigger:
                if(this.mActiveToast != null) {
                    this.mActiveToast.cancel();
                }
                mActiveToast = Toast.makeText(this, R.string.portfolio_button_builditbigger_toast, Toast.LENGTH_SHORT);
                mActiveToast.show();
                break;
            case R.id.portfolio_button_xyz:
                if(this.mActiveToast != null) {
                    this.mActiveToast.cancel();
                }
                mActiveToast = Toast.makeText(this, R.string.portfolio_button_xyz_toast, Toast.LENGTH_SHORT);
                mActiveToast.show();
                break;
            case R.id.portfolio_button_capstone:
                if(this.mActiveToast != null) {
                    this.mActiveToast.cancel();
                }
                mActiveToast = Toast.makeText(this, R.string.portfolio_button_capstone_toast, Toast.LENGTH_LONG);
                mActiveToast.show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
