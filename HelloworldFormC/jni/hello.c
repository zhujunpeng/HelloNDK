#include <stdio.h>
#include <jni.h>

//public native String helloWorldFromC();
jstring Java_com_example_helloworldformc_MainActivity_helloWorldFromC(JNIEnv* env,jobject obj){
	// 2 ʵ��C����
	// ����һ��java string���͵��ַ���
	// (*NewStringUTF)(JNIEnv*, const char*);
//	return (**env).NewStringUTF(env,"helloworldfromC");
	return (*env)->NewStringUTF(env,"helloworldfromC");

	// android.mk ���߱���������ν�c�������ɺ�����
	// 3  ����.mk�ļ�
	// 4 ��C�������ɺ�����
}
