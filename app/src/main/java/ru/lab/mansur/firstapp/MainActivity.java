package ru.lab.mansur.firstapp;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText pass;
    private Button btn, btn2, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton (){
        pass = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.other_btn);
        button2 = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v) {
                        btn.setText("Done");
                        btn.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        Toast.makeText(
                               MainActivity.this, pass.getText(),
                               Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );

        button2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v) {
                        Intent intent = new Intent(".SecondActivity");
                        startActivity(intent);
                    }
                }
        );

        btn2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v) {
                        btn.setText("Done");
                        btn.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                        Toast.makeText(
                                MainActivity.this, "Changing...",
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );

    }






}

