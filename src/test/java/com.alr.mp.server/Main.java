package com.alr.mp.server;

import com.qq.tars.server.core.Server;

import java.io.File;

/**
 * Created by G_dragon on 2017/5/31.
 */
public class Main {

    public static void main (String[] args){

        String path =  System.getProperty("user.dir");
        String configFilename = "AlrApp.MpServer.config.conf";

        String configPath = (path+
                File.separator+"target"+
                File.separator+"tars"+
                File.separator+"conf"+
                File.separator+ configFilename);
        System.setProperty("config", configPath);

        System.setProperty("server.conf.dir", System.getProperty("user.dir")+"/src/test/resources");

        new Server().startUp(args);
    }
}
