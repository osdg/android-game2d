package org.osdg.game2d;

/**
 * Created by plter on 8/30/15.
 */
abstract class Game2DObject {

    private long nativeObjectPointer = 0;

    Game2DObject() {
        nativeObjectPointer = createNativeObject(null);
    }

    Game2DObject(Object[] args){
        nativeObjectPointer = createNativeObject(args);
    }

    abstract long createNativeObject(Object[] args);

    long getNativeObjectPointer() {
        return nativeObjectPointer;
    }

    public boolean equals(Game2DObject o) {
        return getNativeObjectPointer() == o.getNativeObjectPointer();
    }
}
