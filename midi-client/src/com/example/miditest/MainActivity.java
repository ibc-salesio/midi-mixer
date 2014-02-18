package com.example.miditest;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;



public class MainActivity extends Activity {
	 final network nw = new network();

	 public MainActivity() throws Exception{}


    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflater inflater
        = LayoutInflater.from(MainActivity.this);
      View view = inflater.inflate(R.layout.ip_dialog, null);
      final EditText editText
        = (EditText)view.findViewById(R.id.editText1);

      new AlertDialog.Builder(MainActivity.this)
      .setTitle("IPアドレスを入力してね！（ちゃんと入力しないと通信できないから！）")
      .setView(view)
      .setPositiveButton(
        "OK",
        new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
             //"input text = " + editText.getText().toString());
        	  network.ip=editText.getText().toString();
            }
        })
        .show();
    	StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        //setContentView(R.layout.main);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mainフェーダボタン
        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mainclick_Activity.class);
                startActivity(intent);
            }

        });
        //auxフェーダ
        Button c = (Button)findViewById(R.id.button2);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, auxclick_Activity.class);
                startActivity(intent);
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
