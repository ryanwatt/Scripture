package com.scripture.ryanwatt.scripture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);

        editText2 = (EditText) findViewById(R.id.editText2);

        editText3 = (EditText) findViewById(R.id.editText3);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendData();
            }
        });
    }

    private void sendData() {

        Intent intent = new Intent(this, DisplayView.class);

        Bundle bundle = new Bundle();
        bundle.putString("reference", editText.getText().toString() + " " + editText2.getText().toString() + " : " + editText3.getText().toString() );


        intent.putExtras(bundle);
        startActivity(intent);


    }


}
