//
// Created by 佳露 on 2016/8/1.
//

#include "com_example_testjni_NdkJniUtils.h"

JNIEXPORT jstring JNICALL Java_com_example_testjni_NdkJniUtils_getString
        (JNIEnv *env, jobject jc)
{
return env->NewStringUTF("Hello word !!!");
}
