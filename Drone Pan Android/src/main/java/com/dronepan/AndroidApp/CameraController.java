package com.dronepan.AndroidApp;

import dji.sdk.Camera.DJICamera;
import dji.sdk.Camera.DJICameraSettingsDef;
import dji.sdk.Camera.DJIPlaybackManager;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

public class CameraController {
    private DJICamera mCamera;
    private DJIPlaybackManager.DJICameraPlaybackState mState;

    interface CameraControllerInterface {
        void cameraControllerInError(String reason);
        void cameraControllerOK(boolean fromError);
        void cameraControllerNewMedia(String filename);
    }

    public CameraControllerInterface delegate = null;

    public CameraController() {

    }

    public void init(DJICamera cam) {
        mCamera = cam;
    }

    public DJICamera getCurrentCamera() {
        return mCamera;
    }

    public void setPhotoMode() {

    }

}
