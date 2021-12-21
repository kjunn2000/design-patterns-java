package com.moodyjun.mediator;

public class Mediator {
    private RemoteList remoteList;
    private LocalList localList;
    private UploadBtn uploadBtn;
    private DeleteBtn deleteBtn;
    private DownloadBtn downloadBtn;

    public void uploadFile(){
        uploadBtn.setEnable(false);
        deleteBtn.setEnable(false);
        downloadBtn.setEnable(false);
//        refresh list
    }

    public void downloadFile(){
        uploadBtn.setEnable(false);
        deleteBtn.setEnable(false);
        downloadBtn.setEnable(false);
//        refresh list
    }

    public void deleteFile(){
        uploadBtn.setEnable(false);
        deleteBtn.setEnable(false);
        downloadBtn.setEnable(false);
//        refresh list
    }

    public void selectLocalFile(){
        uploadBtn.setEnable(true);
        deleteBtn.setEnable(true);
        downloadBtn.setEnable(false);
//        deselect remote file
    }

    public void selectRemoteFile(){
        downloadBtn.setEnable(true);
        deleteBtn.setEnable(true);
        uploadBtn.setEnable(false);
//        deselect local file
    }

}
