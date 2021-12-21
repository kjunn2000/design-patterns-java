package com.moodyjun.mediator;

public class LocalList {
    private Mediator mediator;

    public void uploadFile(){
//        upload file
        mediator.uploadFile();
    }

    public void deleteFile(){
//        delete file
        mediator.deleteFile();
    }

    public void selectFile(){
        mediator.selectLocalFile();
    }
}
