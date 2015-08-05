#include <stdio.h>
#include <jni.h>

//public native String helloWorldFromC();
jstring Java_com_example_helloworldformc_MainActivity_helloWorldFromC(JNIEnv* env,jobject obj){
	// 2 实现C代码
	// 返回一个java string类型的字符串
	// (*NewStringUTF)(JNIEnv*, const char*);
//	return (**env).NewStringUTF(env,"helloworldfromC");
	return (*env)->NewStringUTF(env,"helloworldfromC");

	// android.mk 告诉编译器，如何将c代码打包成函数库
	// 3  生成.mk文件
	// 4 把C代码打包成函数库
}
