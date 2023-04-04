package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import static android.view.View.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1,b2,b3,b4,b5;
    TextView tv1;
    int n1=0,n2=0;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.et1);
        t2 = (EditText) findViewById(R.id.et2);
        b1 = (Button) findViewById(R.id.btnAdd);
        b2 = (Button) findViewById(R.id.btnSub);
        b3 = (Button) findViewById(R.id.btnMult);
        b4 = (Button) findViewById(R.id.btnDiv);
        b5 = (Button) findViewById(R.id.btnClear);
        tv1 = (TextView) findViewById(R.id.tv1);

        b1.setOnClickListener(new OnClickListener()
        { @Override
        public void onClick(View v)
        {
            try
            {
                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                n1 = Integer.parseInt(s1);
                n2 = Integer.parseInt(s2);
                int sum = n1 + n2;
                tv1.setText("Addition ="+sum);
            }
            catch (NumberFormatException e) { }
        }
        });

        b2.setOnClickListener(new OnClickListener()
        { @Override
        public void onClick(View v)
        {
            try
            {
                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                n1 = Integer.parseInt(s1);
                n2 = Integer.parseInt(s2);
                int sub = n1 - n2;
                tv1.setText("Subtraction ="+sub);
            }
            catch (NumberFormatException e) { }
        }
        });

        b3.setOnClickListener(new OnClickListener()
        { @Override
        public void onClick(View v)
        {
            try
            {
                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                n1 = Integer.parseInt(s1);
                n2 = Integer.parseInt(s2);
                int mul = n1 * n2;
                tv1.setText("Multiplication ="+mul);
            }
            catch (NumberFormatException e) { }
        }
        });

        b4.setOnClickListener(new OnClickListener()
        { @Override
        public void onClick(View v)
        {
            try
            {
                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                n1 = Integer.parseInt(s1);
                n2 = Integer.parseInt(s2);
                int div = n1 / n2;
                tv1.setText("Division ="+div);
            }
            catch (NumberFormatException e) { }
        }
        });

        b5.setOnClickListener(new OnClickListener()
        { @Override
        public void onClick(View v)
        {
            t1.setText(" ");
            t2.setText(" ");
            tv1.setText(" ");
        }
        });
    }
}