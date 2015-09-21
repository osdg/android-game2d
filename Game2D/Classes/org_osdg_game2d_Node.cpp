#include "org_osdg_game2d_Node.h"
#include <cocos2d.h>


static inline cocos2d::Node* convert(jlong pointer){
    return (cocos2d::Node *) pointer;
}

static inline cocos2d::Action* convertToAction(jlong action){
    return (cocos2d::Action *) action;
}

/*
 * Class:     org_osdg_game2d_Node
 * Method:    addChild
 * Signature: (JJ)V
 */
void Java_org_osdg_game2d_Node_addChild
(JNIEnv *, jobject, jlong self, jlong child){
    convert(self)->addChild(convert(child));
}


/*
 * Class:     org_osdg_game2d_Node
 * Method:    setPosition
 * Signature: (JFF)V
 */
void Java_org_osdg_game2d_Node_setPosition
(JNIEnv *, jobject, jlong self, jfloat x, jfloat y){
    convert(self)->setPosition(x,y);
}

/*
 * Class:     org_osdg_game2d_Node
 * Method:    runAction
 * Signature: (JJ)V
 */
void Java_org_osdg_game2d_Node_runAction
(JNIEnv *, jobject, jlong self, jlong action){
    convert(self)->runAction(convertToAction(action));
}