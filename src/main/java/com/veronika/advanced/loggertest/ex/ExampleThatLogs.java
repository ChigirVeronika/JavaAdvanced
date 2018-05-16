package com.veronika.advanced.loggertest.ex;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ExampleThatLogs {

    private static final Log LOG =
            LogFactory.getLog(ExampleThatLogs.class);

    public String concat(String a, String b) {
        LOG.info("String a:" + a + ", String b:" + b);
        return a+b;
    }
}
