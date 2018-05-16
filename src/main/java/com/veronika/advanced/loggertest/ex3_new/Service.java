package com.veronika.advanced.loggertest.ex3_new;

import org.apache.log4j.Logger;

public class Service {
    private static final Logger LOG = Logger.getLogger(Service.class);

    public void serve(){
        LOG.debug("I am a serve method");
    }
}
