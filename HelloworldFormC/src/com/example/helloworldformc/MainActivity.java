package com.example.helloworldformc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	// 1 ����һ��c�����Ľӿ� �൱����java�����ж�����һ���ӿ�,�ӿ�����ʹ��C����ʵ�ֵ�
	public native String helloWorldFromC();
	
	// 5 ��java���������뺯����
	static{
		System.loadLibrary("hello");
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    
    public void click(View v){
    	// ����һ����˾
    	Toast.makeText(this, helloWorldFromC(), Toast.LENGTH_SHORT).show();
    }
}
