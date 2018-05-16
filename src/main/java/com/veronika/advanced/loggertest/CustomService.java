package com.veronika.advanced.loggertest;


import org.apache.log4j.Logger;
import org.slf4j.event.SubstituteLoggingEvent;

public class CustomService {
    static final Logger LOG = Logger.getLogger(CustomService.class);

    public void check() {
        System.out.println(LOG.getClass());
        LOG.debug("Log DEBUG message in CustomService.check");
        LOG.info("Log INFO message in CustomService.check");
        SubstituteLoggingEvent event = new SubstituteLoggingEvent();
        //event.setLogger(LOG);
        System.out.println(event.getArgumentArray().length);
    }
}
