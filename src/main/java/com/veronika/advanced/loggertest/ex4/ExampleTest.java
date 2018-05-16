package com.veronika.advanced.loggertest.ex4;

import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ExampleTest {

    @Mock
    private Appender mockAppender;

    @Mock
    private Logger logger;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        logger = Logger.getLogger(Example.class);
        logger.addAppender(mockAppender);
    }

    @Test
    public void doLoggingTest() {
        Example classWithLog4JLogger = new Example();
        classWithLog4JLogger.doSomething(1);

        ArgumentCaptor<LoggingEvent> eventArgumentCaptor = ArgumentCaptor.forClass(LoggingEvent.class);

        verify(mockAppender, times(2)).doAppend(eventArgumentCaptor.capture());
        Assert.assertEquals(" - метод doSomethingWithInt вызван с параметром i = 1", eventArgumentCaptor.getAllValues().get(0).getMessage());
        Assert.assertEquals(" - параметр i больше нуля", eventArgumentCaptor.getAllValues().get(1).getMessage());
    }
}