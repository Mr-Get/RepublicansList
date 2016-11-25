package at.obsidion.markus.republicanslist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Leo Ignis on 25.11.2016.
 */

public class ShowRepublicanActivity extends AppCompatActivity {
    private Republican republican;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);

        Intent intent = getIntent();
        republican = (Republican)intent.getExtras().get("user");


        TextView viewName = (TextView) findViewById(R.id.textViewName);
        TextView viewAge = (TextView) findViewById(R.id.textViewAge);
        TextView viewAddress = (TextView) findViewById(R.id.textViewAddress);
        TextView viewPhone = (TextView) findViewById(R.id.textViewPhone);
        TextView viewVotes = (TextView) findViewById(R.id.textViewVotes);


        viewName.setText(republican.getName());
        viewAge.setText(republican.getAge());
        viewAddress.setText(republican.getAddress());
        viewPhone.setText(republican.getPhoneNumber());
        viewVotes.setText(republican.getVotes());

    }


    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q="+republican.getAddress());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:"+republican.getPhoneNumber());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

}
