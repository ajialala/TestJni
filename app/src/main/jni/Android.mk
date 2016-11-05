LOCAL_PATH := $(call my-dir)
                               include $(CLEAR_VARS)

                               LOCAL_MODULE := NdkJniUtils
                               LOCAL_SRC_FILES := com_example_testjni_NdkJniUtils.cpp
                               include $(BUILD_SHARED_LIBRARY)