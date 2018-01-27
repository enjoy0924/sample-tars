package com.alr.mp.listener;

import com.qq.tars.server.core.AppContextEvent;
import com.qq.tars.server.core.AppContextListener;
import com.qq.tars.server.core.AppServantEvent;
import com.qq.tars.support.log.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by G_dragon on 2017/5/31.
 */
public class AppStartListener implements AppContextListener {

    private static Logger logger = Logger.getLogger("mp-servant");

    @Override
    public void appContextStarted(AppContextEvent event) {
        try {
            new ClassPathXmlApplicationContext("classpath*:spring-context-*.xml");
            logger.info("initial spring env done ! ! ! ");

        }catch (Exception e){
            logger.error("initial spring env error: " + e.getMessage());
        }
    }

    @Override
    public void appServantStarted(AppServantEvent event) {
        logger.info("servants started ! ! !");
    }

}
