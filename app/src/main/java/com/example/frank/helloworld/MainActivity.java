package com.example.frank.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText inputText;
    TextView textview;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = findViewById(R.id.editText);
        textview = findViewById(R.id.textView3);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                message = inputText.getText().toString();
                textview.setText(message);
                //Toast.makeText(getApplicationContext(),message.toCharArray(),1).show();
            }

        });
    }

    /*
    public void clickButton(View view){

        Toast.makeText(getApplicationContext(),"Click Button !!",1).show();
    }
    */
}
