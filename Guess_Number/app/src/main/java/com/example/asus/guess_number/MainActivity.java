package com.example.asus.guess_number;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String r;
    TextView textView;
    Button btn;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn);
        editText = (EditText)findViewById(R.id.edittext);
        textView = (TextView)findViewById(R.id.textview);
        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String computer ="1024";
                char[] edit = editText.getText().toString().toCharArray();
                char[] target = computer.toCharArray();
                int A=0;
                int B=0;
                for(int i=0;i<edit.length;i++) {
                    for(int j=0;j<target.length;j++){
                        if(edit[i]==target[j]){
                            if(i==j){
                                A++;
                            }
                            else{
                                B++;
                            }
                        }
                    }
                }
                r = A+"A"+B+"B";
                textView.setText(r);
            }

        });
    }

}

