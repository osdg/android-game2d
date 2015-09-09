package org.osdg.game2d;

/**
 * Created by plter on 9/8/15.
 */
public abstract class Node extends Game2DObject {


    public Node() {
    }

    public Node(Object[] args) {
        super(args);
    }

    public void addChild(Node node) {
        addChild(getNativeObjectPointer(), node.getNativeObjectPointer());
    }

    private native void addChild(long self, long child);

    public void setPosition(float x, float y) {
        setPosition(getNativeObjectPointer(), x, y);
    }

    private native void setPosition(long self, float x, float y);
}
