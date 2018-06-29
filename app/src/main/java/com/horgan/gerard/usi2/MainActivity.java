package com.horgan.gerard.usi2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mybutton) {
            Toast.makeText(this, "PANIC BUTTON FOR EMERGENCY NUMBER",
                    Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:12345678"));
            startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    private CardView mInfoCard, mConversationCard, mMapCard, mLinksCard;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInfoCard= findViewById(R.id.infoCard);
        mConversationCard= findViewById(R.id.conversationCard);
        mMapCard= findViewById(R.id.mapCard);
        mLinksCard= findViewById(R.id.linksCard);

        mInfoCard.setOnClickListener(this);
        mConversationCard.setOnClickListener(this);
        mMapCard.setOnClickListener(this);
        mLinksCard.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent intent;



        switch (v.getId()){
            case R.id.infoCard: intent= new Intent(this, InfoActivity.class); startActivity(intent); break;
            case R.id.conversationCard: intent= new Intent(this, ConversationActivity.class); startActivity(intent); break;
            case R.id.mapCard: intent= new Intent(this, MapActivity.class); startActivity(intent); break;
            case R.id.linksCard: intent= new Intent(this, LinksActivity.class); startActivity(intent); break;
            default: break;



        }

    }
}
