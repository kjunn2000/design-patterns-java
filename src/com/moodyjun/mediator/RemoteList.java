package com.moodyjun.mediator;

public class RemoteList {
    private Mediator mediator;

    public void downloadFile(){
//        download file
        mediator.downloadFile();
    }

    public void deleteFile(){
//         delete file
        mediator.deleteFile();
    }

    public void selectFile(){
        mediator.selectRemoteFile();
    }
}
