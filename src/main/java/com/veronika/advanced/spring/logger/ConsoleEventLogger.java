package com.veronika.advanced.spring.logger;

import com.veronika.advanced.spring.bean.Event;

public class ConsoleEventLogger implements EventLogger {

    public  ConsoleEventLogger(){}

    public void logEvent(Event event) {
        System.out.println(event.toString() );
    }
}
