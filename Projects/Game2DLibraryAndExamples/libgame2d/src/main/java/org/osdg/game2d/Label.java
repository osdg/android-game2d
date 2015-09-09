package org.osdg.game2d;

/**
 * Created by plter on 8/30/15.
 */
public class Label extends Node {

    public void setString(String str){
        nativeSetString(getNativeObjectPointer(),str);
    }

    private native void nativeSetString(long nativeObjectPointer, String str);

    public void setSystemFontSize(float size){
        setSystemFontSize(getNativeObjectPointer(),size);
    }

    private native void setSystemFontSize(long self,float size);

    @Override
    long createNativeObject(Object[] args) {
        return createNativeObject();
    }
    native long createNativeObject();
}
