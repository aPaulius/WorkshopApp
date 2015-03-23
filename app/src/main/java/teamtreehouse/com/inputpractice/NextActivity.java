package teamtreehouse.com.inputpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class NextActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        final TextView mPhoneTextView = (TextView) findViewById(R.id.phoneTextView);
        final TextView mEmailTextView = (TextView) findViewById(R.id.emailTextView);

        Intent intent = getIntent();
        String email = intent.getStringExtra(getString(R.string.key_email));
        String phone = intent.getStringExtra(getString(R.string.key_phone));
        mEmailTextView.setText(email);
        mPhoneTextView.setText(phone);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.next, menu);
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
}
