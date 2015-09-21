#include "org_osdg_game2d_actions_MoveBy.h"
#include <cocos2d.h>


/*
 * Class:     org_osdg_game2d_actions_MoveBy
 * Method:    createNativeObject
 * Signature: (FFF)J
 */
jlong Java_org_osdg_game2d_actions_MoveBy_createNativeObject
(JNIEnv *, jobject, jfloat duration, jfloat x, jfloat y){
    return (jlong) cocos2d::MoveBy::create(duration,cocos2d::Vec2(x,y));
}