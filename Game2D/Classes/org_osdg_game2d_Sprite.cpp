#include "org_osdg_game2d_Sprite.h"
#include <cocos2d.h>
#include <platform/android/jni/JniHelper.h>


/*
 * Class:     org_osdg_game2d_Sprite
 * Method:    createNativeObject
 * Signature: ()J
 */
jlong Java_org_osdg_game2d_Sprite_createNativeObject__
(JNIEnv *, jobject){
    return (jlong) cocos2d::Sprite::create();
}

/*
 * Class:     org_osdg_game2d_Sprite
 * Method:    createNativeObject
 * Signature: (Ljava/lang/String;)J
 */
jlong Java_org_osdg_game2d_Sprite_createNativeObject__Ljava_lang_String_2
(JNIEnv *, jobject, jstring str){
    return (jlong) cocos2d::Sprite::create(cocos2d::JniHelper::jstring2string(str));
}