package com.kbeta.jni.learnjni;

/**
 * Created by Kevin Dong on 2017/5/26.
 */
public class StringJniTest {

    static {
        System.loadLibrary("jniTestMain");   //defaultConfig.ndk.moduleName
    }

    public String key = "leanJni";
    public native static String getString();

    public native String accessField();

}
