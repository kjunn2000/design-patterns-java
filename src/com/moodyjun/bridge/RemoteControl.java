package com.moodyjun.bridge;

public class RemoteControl {
    protected TV tv;

    public void on(){
        tv.on();
    }

    public void off(){
        tv.off();
    }

    public void tuneChannel(int channel) {
        tv.tuneChannel(channel);
    }
}
