package com.veronika.advanced.spring;


import com.veronika.advanced.spring.bean.Client;
import com.veronika.advanced.spring.bean.Event;
import com.veronika.advanced.spring.bean.EventType;
import com.veronika.advanced.spring.logger.EventLogger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class App {
    private Client client;

    private EventLogger eventLogger;

    private Map<EventType, EventLogger> loggers;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        Event event = ctx.getBean(Event.class);
        app.logEvent(event,EventType.INFO, "Some event for 1");

        event = ctx.getBean(Event.class);
        app.logEvent(event, EventType.ERROR, "Some event for 2");

        event = ctx.getBean(Event.class);
        app.logEvent(event, null, "Some event for 2");

        ctx.close();
    }

    public App(Client client, EventLogger eventLogger, Map<EventType, EventLogger> map) {
        super();
        this.client = client;
        this.eventLogger = eventLogger;
        this.loggers = map;
    }

    private void logEvent(Event event, EventType eventType, String msg) {
        String message = msg.replaceAll(client.getId().toString(), client.getFullName());
        event.setMsg(message);

        EventLogger logger = loggers.get(eventType);
        if (logger == null) {
            logger = eventLogger;
        }

        logger.logEvent(event);
    }
}
