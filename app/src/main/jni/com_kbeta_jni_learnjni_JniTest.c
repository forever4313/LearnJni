#include <com_kbeta_jni_learnjni_JniTest.h>
/*
 * Class:     com_kbeta_jni_learnjni_JniTest
 * Method:    getInt
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_kbeta_jni_learnjni_JniTest_getInt
  (JNIEnv *env, jclass jclzz){
   return 12;
  }

/*
 * Class:     com_kbeta_jni_learnjni_JniTest
 * Method:    getFloat
 * Signature: ()F
 */
JNIEXPORT jfloat JNICALL Java_com_kbeta_jni_learnjni_JniTest_getFloat
  (JNIEnv *env, jclass jclzz){
    return 12.122;
   }

/*
 * Class:     com_kbeta_jni_learnjni_JniTest
 * Method:    getChar
 * Signature: ()C
 */
JNIEXPORT jchar JNICALL Java_com_kbeta_jni_learnjni_JniTest_getChar
  (JNIEnv *env, jclass jclzz){
     return 'C';
   }


JNIEXPORT jstring JNICALL Java_com_kbeta_jni_learnjni_JniTest_getString
  (JNIEnv *env, jclass jclzz){
    return (*env)->NewStringUTF(env,"hello jni");
  }