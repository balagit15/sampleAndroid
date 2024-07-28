package com.example.calculator_app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView sol,res;
    MaterialButton buttonC,buttonOpen,buttonClose;
    MaterialButton buttondiv,buttonadd,buttonsub,buttonmul,buttonequal;
    MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    MaterialButton buttonAC,buttondot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View res=findViewById(R.id.result);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View sol=findViewById(R.id.solutionTv);
        assignId(buttonC,R.id.button_c);
        assignId(buttonOpen,R.id.button_p1);
        assignId(buttonClose,R.id.button_p2);
        assignId(buttondiv,R.id.button_div);
        assignId(buttonmul,R.id.button_mul);
        assignId(buttonsub,R.id.button_sub);
        assignId(buttonadd,R.id.button_add);
        assignId(button0,R.id.button_0);
        assignId(button1,R.id.button_1);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);
        assignId(buttondot,R.id.button_dot);
        assignId(buttonAC,R.id.button_ac);
        assignId(buttonequal,R.id.button_equal);







    }
    void assignId(MaterialButton btn,int id)
    {
        btn=findViewById(id);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();

        sol.setText(buttonText);
        }

}



