package com.example.activitytext;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intent=new Intent();
        intent.putExtra("data_return","Hello FirstActivity" );
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        /*Intent intent=getIntent();
        String data=((Intent) intent).getStringExtra("extra_data");
        Log.d("SecondActivity",data);*///给下一个活动传递数据
        Button button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =new Intent();
                intent.putExtra("data_return","Hello FirstActivity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}
