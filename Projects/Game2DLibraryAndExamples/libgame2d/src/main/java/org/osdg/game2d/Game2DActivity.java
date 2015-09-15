package org.osdg.game2d;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import org.cocos2dx.lib.Cocos2dxActivity;

/**
 * Created by plter on 8/28/15.
 */
public class Game2DActivity extends Cocos2dxActivity{

    private static Game2DActivity game2DActivity;
    private View interactiveView;

    public Game2DActivity(){
        game2DActivity = this;
    }

    public static Game2DActivity getGame2DActivity() {
        return game2DActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        interactiveView = new View(this);
        addContentView(interactiveView, new FrameLayout.LayoutParams(-1, -1));
        interactiveView.setLongClickable(true);
        interactiveView.setFocusableInTouchMode(true);
        interactiveView.setFocusable(true);
        interactiveView.requestFocus();
    }

    protected void onCreationComplete(){}

    @Override
    protected final void onLoadNativeLibraries() {
        System.loadLibrary("game2d");
    }

    private static void nativeCreationCompleteCallback(){
        game2DActivity.onCreationComplete();
    }

    public View getInteractiveView() {
        return interactiveView;
    }

    public void setOnClickListener(View.OnClickListener l){
        interactiveView.setOnClickListener(l);
    }

    public void setOnTouchListener(View.OnTouchListener l){
        interactiveView.setOnTouchListener(l);
    }

    public void setOnCreateContextMenuListener(View.OnCreateContextMenuListener l) {
        interactiveView.setOnCreateContextMenuListener(l);
    }

    public void setOnKeyListener(View.OnKeyListener l) {
        interactiveView.setOnKeyListener(l);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener l) {
        interactiveView.setOnFocusChangeListener(l);
    }

    public void setOnLongClickListener(View.OnLongClickListener l) {
        interactiveView.setOnLongClickListener(l);
    }
}
