package com.Alatheer.Projects.lailaky.Activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.Alatheer.Projects.lailaky.R;

public class Credit extends AppCompatActivity {

    private TextView txt_credit;
    private Button btn_credit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit2);
        initView();

    }

    private void initView() {
        txt_credit=findViewById(R.id.txt_credit);
        btn_credit=findViewById(R.id.btn_credit);


        btn_credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Credit.this,MainActivity.class);
                intent.putExtra("user_type","client");
                startActivity(intent);
                finish();
            }
        });
    }
}
