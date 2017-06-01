package com.kbeta.jni.learnjni;

/**
 * Created by Kevin Dong on 2017/5/27.
 */
public class ArrayJniTest {

    static {
        System.loadLibrary("jniTestMain");   //defaultConfig.ndk.moduleName
    }

    public native static int getSumOfArray(int[] arr, int len);

    public native static int[][]  initInt2DArray(int size);

}
