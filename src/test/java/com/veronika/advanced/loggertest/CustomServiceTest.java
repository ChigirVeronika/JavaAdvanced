package com.veronika.advanced.loggertest;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.slf4j.LoggerFactory;

import static com.veronika.advanced.loggertest.CustomService.LOG;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomServiceTest {

    @InjectMocks
    private CustomService customService = new CustomService();

    private static ch.qos.logback.classic.Logger fruityLogger;
    private static ListAppender<ILoggingEvent> fruityLoggerAppender;

    @BeforeClass
    public static void setupBeforeClass() {
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        fruityLogger = context.getLogger(String.valueOf(LOG));
        fruityLoggerAppender = new ListAppender<>();
        fruityLoggerAppender.start();
        fruityLogger.addAppender(fruityLoggerAppender);
    }

    @Before
    public void setup() {
        //fruityLogger.setLevel(Level.ALL);
        //fruityLoggerAppender.clearAllFilters();
        //fruityLoggerAppender.list.clear();
    }

    @Test
    public void check() throws Exception {
        String fruityMessage = "Log message";
        ILoggingEvent loggedEvent = fruityLoggerAppender.list.get(0);

        assertThat(loggedEvent.getLevel()).isEqualTo(Level.INFO);
        assertThat(loggedEvent.getFormattedMessage()).contains("Log message");
        //Mockito.doCallRealMethod(LOG.debug(LOG.debug("Log message")))

        Assert.assertEquals(loggedEvent.getArgumentArray().length, 0);
    }

}