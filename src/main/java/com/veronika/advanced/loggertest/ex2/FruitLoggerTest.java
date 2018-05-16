package com.veronika.advanced.loggertest.ex2;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import static com.veronika.advanced.loggertest.ex2.FruitLogger.INSTANCE;
import static com.veronika.advanced.loggertest.ex2.FruitLogger.log;

public class FruitLoggerTest {
    private static Logger fruityLogger;
    private static ListAppender<ILoggingEvent> fruityLoggerAppender;

    @BeforeClass
    public static void setupBeforeClass() {
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        fruityLogger = context.getLogger(log.getName());
        fruityLoggerAppender = new ListAppender<>();
        fruityLoggerAppender.start();
        fruityLogger.addAppender(fruityLoggerAppender);
    }

    @Before
    public void setup() {
        fruityLogger.setLevel(Level.ALL);
        fruityLoggerAppender.clearAllFilters();
        fruityLoggerAppender.list.clear();
    }

    @Test
    public void verify_that_the_fruity_message_content_is_logged_at_info_level() {
        Assertions.assertThat(fruityLoggerAppender.list).hasSize(0);

        String fruityMessage = "message";
        INSTANCE.logAllFruitMessages(fruityMessage);

        ILoggingEvent loggedEvent = fruityLoggerAppender.list.get(0);
        Assertions.assertThat(loggedEvent.getLevel()).isEqualTo(Level.INFO);
        Assertions.assertThat(loggedEvent.getFormattedMessage()).contains("message");

        Assert.assertEquals(loggedEvent.getArgumentArray().length, 2);
    }
}