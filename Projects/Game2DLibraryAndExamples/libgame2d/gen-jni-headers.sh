#!/usr/bin/env bash

cd src/main/java
javah -d ../../../../../../Game2D/Classes/ -jni org.osdg.game2d.Director
javah -d ../../../../../../Game2D/Classes/ -jni org.osdg.game2d.Scene
javah -d ../../../../../../Game2D/Classes/ -jni org.osdg.game2d.Layer
javah -d ../../../../../../Game2D/Classes/ -jni org.osdg.game2d.Label
javah -d ../../../../../../Game2D/Classes/ -jni org.osdg.game2d.Node
javah -d ../../../../../../Game2D/Classes/ -jni org.osdg.game2d.Sprite
javah -d ../../../../../../Game2D/Classes/ -jni org.osdg.game2d.actions.MoveBy