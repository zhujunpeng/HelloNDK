package com.example.helloworldformc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	// 1 定义一个c方法的接口 相当于在java代码中定义了一个接口,接口语言使用C代码实现的
	public native String helloWorldFromC();
	
	// 5 在java代码中引入函数库
	static{
		System.loadLibrary("hello");
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    
    public void click(View v){
    	// 弹出一个土司
    	Toast.makeText(this, helloWorldFromC(), Toast.LENGTH_SHORT).show();
    }
}
