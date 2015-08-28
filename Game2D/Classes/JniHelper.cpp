//
// Created by plter on 8/28/15.
//

#include "JniHelper.h"
#include <platform/android/jni/JniHelper.h>

void game2d::JniHelper::callStaticVoidMethod(std::string className, std::string methodName) {
    cocos2d::JniMethodInfo minfo;
    cocos2d::JniHelper::getStaticMethodInfo(minfo,className.c_str(),methodName.c_str(),"()V");
    minfo.env->CallStaticVoidMethod(minfo.classID,minfo.methodID);
}
