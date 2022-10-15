package com.example.pelindromechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView op;
    EditText in;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op=findViewById(R.id.output);
        b=findViewById(R.id.button);
        in=findViewById(R.id.input);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = in.getText().toString();
                int l = s.length();
                String s1 = "";
                for(int i=l-1;i>=0;i--){
                    s1 = new StringBuilder().append(s1).append(s.charAt(i)).toString();

//                    s1 += s.charAt(i);
                }
                if(s.equals(s1)){
                    op.setText("the entered word or number is palindrome");
                }
                else {
                    op.setText("the entered word or number is not a palindrome");
                }
            }
        });
    }
}