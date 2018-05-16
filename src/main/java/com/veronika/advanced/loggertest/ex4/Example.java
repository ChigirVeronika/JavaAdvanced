package com.veronika.advanced.loggertest.ex4;

import org.apache.log4j.Logger;

public class Example {
    private static final Logger logger = Logger.getLogger(Example.class);

    public void doSomething(int i) {

        logger.info("метод doSomethingWithInt вызван с параметром i = " + i);
        if (i > 0) {
            logger.info("параметр i больше нуля");
        } else {
            logger.info("параметр i меньше или равен нулю");
        }
    }
}
