package com.veronika.advanced.loggertest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main2 {

    public static void main(String[] args) {
        Logger LOG = LoggerFactory.getLogger(Main2.class);
        LOG.info("Main2 INFO message");
    }
}
