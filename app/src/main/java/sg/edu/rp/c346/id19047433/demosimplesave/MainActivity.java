package sg.edu.rp.c346.id19047433.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.preference.PreferenceManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // create a instance for SharedPreferences
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //Create a instance for SharedPreferences Editor
        SharedPreferences.Editor prefEdit = prefs.edit();
        // adding the key-Value pair
        prefEdit.putString("greeting", "HELLO!");
        //Call commit to save the changes for SharedPreferences
        prefEdit.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String msg = prefs.getString("greeting","No greeting!");
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
