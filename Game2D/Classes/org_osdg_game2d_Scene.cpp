#include "org_osdg_game2d_Scene.h"
#include <cocos2d.h>


/*
 * Class:     org_osdg_game2d_Scene
 * Method:    createNativeObject
 * Signature: ()J
 */

jlong Java_org_osdg_game2d_Scene_createNativeObject
        (JNIEnv *, jobject) {
    return (jlong) cocos2d::Scene::create();
}