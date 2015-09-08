package org.osdg.game2d;

/**
 * Created by plter on 8/30/15.
 */
public class Label extends Node {
    @Override
    native long createNativeObject();

    public void setString(String str){
        nativeSetString(getNativeObjectPointer(),str);
    }

    private native void nativeSetString(long nativeObjectPointer, String str);
}
