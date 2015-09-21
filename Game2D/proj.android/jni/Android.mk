LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

$(call import-add-path,$(LOCAL_PATH)/../../cocos2d)
$(call import-add-path,$(LOCAL_PATH)/../../cocos2d/external)
$(call import-add-path,$(LOCAL_PATH)/../../cocos2d/cocos)

LOCAL_MODULE := game2d_shared

LOCAL_MODULE_FILENAME := libgame2d

LOCAL_SRC_FILES := hellocpp/main.cpp \
                   ../../Classes/AppDelegate.cpp \
                   ../../Classes/HelloWorldScene.cpp \
                   ../../Classes/JniHelper.cpp \
                   ../../Classes/org_osdg_game2d_Director.cpp \
                   ../../Classes/org_osdg_game2d_Scene.cpp \
                   ../../Classes/org_osdg_game2d_Layer.cpp \
                   ../../Classes/org_osdg_game2d_Node.cpp \
                   ../../Classes/org_osdg_game2d_Sprite.cpp \
                   ../../Classes/org_osdg_game2d_actions_MoveBy.cpp \
                   ../../Classes/org_osdg_game2d_Label.cpp

LOCAL_C_INCLUDES := $(LOCAL_PATH)/../../Classes

# _COCOS_HEADER_ANDROID_BEGIN
# _COCOS_HEADER_ANDROID_END


LOCAL_STATIC_LIBRARIES := cocos2dx_static

# _COCOS_LIB_ANDROID_BEGIN
# _COCOS_LIB_ANDROID_END

include $(BUILD_SHARED_LIBRARY)

$(call import-module,.)

# _COCOS_LIB_IMPORT_ANDROID_BEGIN
# _COCOS_LIB_IMPORT_ANDROID_END
