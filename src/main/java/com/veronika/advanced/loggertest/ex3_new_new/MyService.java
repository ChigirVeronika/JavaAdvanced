package com.veronika.advanced.loggertest.ex3_new_new;

import org.apache.log4j.Logger;

public class MyService {
    private static final Logger LOG = Logger.getLogger(MyService.class);

    public void serve(){
        LOG.debug("I am a log method");
    }
}
