/* DO NOT EDIT THIS FILE - it is machine generated */
#include <com_kbeta_jni_learnjni_ArrayJniTest.h>
#include <stdlib.h>
/*
 * Class:     com_kbeta_jni_learnjni_ArrayJniTest
 * Method:    getSumOfArray
 * Signature: ([I)I
 */
JNIEXPORT jint JNICALL Java_com_kbeta_jni_learnjni_ArrayJniTest_getSumOfArray
  (JNIEnv *env, jclass jclzz, jintArray arr,jint len){

    jint *carr;
    jint i,sum =0;
    carr = (*env)->GetIntArrayElements(env, arr,NULL);
    if(carr == NULL){
        return 0;
    }

    for(i=0;i<len;i++){
        sum = sum + carr[i];
    }
    return sum;


  }

JNIEXPORT jobjectArray JNICALL Java_com_kbeta_jni_learnjni_ArrayJniTest_initInt2DArray
  (JNIEnv *env, jclass jcls, jint size){

      jobjectArray result ;
      int i;
      jclass  intArrClass = (*env)->FindClass(env,"[I");
      if(intArrClass == NULL){
        return NULL;
      }
      result = (*env)->NewObjectArray(env,size,intArrClass,NULL);
      if(result == NULL){
        return NULL;
      }
      for(i =0;i<size;i++){
        jint temp[256];
        int j;
        jintArray iarr = (*env)->NewIntArray(env,size);
        if(iarr == NULL){
            return NULL;
        }
        for(j=0;j<size;j++){
            temp[j] = i+j;
        }
        (*env)->SetIntArrayRegion(env,iarr,0,size,temp);
        (*env)->SetObjectArrayElement(env,result,i,iarr);
        (*env)->DeleteLocalRef(env,iarr);
      }
      return result;

  }

  int compare(int *a,int *b){
        return (*a)- (*b);
  }

  JNIEXPORT jintArray JNICALL Java_com_kbeta_jni_learnjni_ArrayJniTest_sortIntArray
    (JNIEnv *env, jclass jclss, jintArray jintArr){
        // 获取数组
        jint *elements = (*env)->GetIntArrayElements(env,jintArr,NULL);
        //长度
        int len = (*env)->GetArrayLength(env,jintArr);
        //排序
        qsort(elements,len,sizeof(jint),compare);
        //同步
        (*env)->ReleaseIntArrayElements(env,jintArr,elements,0);
        return jintArr;
    }

