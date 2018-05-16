package com.veronika.advanced.loggertest.ex3_new_iflog4j;

import org.apache.log4j.Logger;

public class Service2 {
    private static final Logger LOG = Logger.getLogger(Service2.class);

    public void serve(){
        logger().debug("I am a serve 2 method");
    }

    // package private method for testing purposes to allow to inject a mock
    Logger logger() {
        return LOG;
    }
}
