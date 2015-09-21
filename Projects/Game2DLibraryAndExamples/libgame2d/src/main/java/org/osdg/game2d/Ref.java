package org.osdg.game2d;

/**
 * Created by plter on 8/30/15.
 */
public abstract class Ref {

    private long nativeObjectPointer = 0;

    public Ref() {
        nativeObjectPointer = createNativeObject(null);
    }

    public Ref(Object[] args){
        nativeObjectPointer = createNativeObject(args);
    }

    protected abstract long createNativeObject(Object[] args);

    public long getNativeObjectPointer() {
        return nativeObjectPointer;
    }

    public boolean equals(Ref o) {
        return getNativeObjectPointer() == o.getNativeObjectPointer();
    }
}
