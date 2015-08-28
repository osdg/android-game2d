//
// Created by plter on 8/28/15.
//

#ifndef GAME2D_JNIHELPER_H
#define GAME2D_JNIHELPER_H

#include <string>

namespace game2d {
    class JniHelper {

    public:
        static void callStaticVoidMethod(std::string className, std::string methodName);
    };
}


#endif //GAME2D_JNIHELPER_H
