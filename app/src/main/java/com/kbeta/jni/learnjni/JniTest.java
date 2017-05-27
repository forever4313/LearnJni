package com.kbeta.jni.learnjni;

/**
 * Created by Kevin Dong on 2017/5/26.
 */
public class JniTest {

    static {
        System.loadLibrary("jniTestMain");   //defaultConfig.ndk.moduleName
    }
    public native  static int getInt();
    public native static float getFloat();
    public native static char getChar();


}
