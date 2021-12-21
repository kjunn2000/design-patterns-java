package com.moodyjun.bridge;

public class ConcreteRemote extends RemoteControl{
   private int channel;

   public void channelUp(){
      this.channel++;
      tuneChannel(this.channel);
   }

   public void channelDown(){
      this.channel--;
      tuneChannel(this.channel);
   }
}
