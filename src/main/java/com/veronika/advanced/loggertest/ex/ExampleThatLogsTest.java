package com.veronika.advanced.loggertest.ex;

import org.apache.log4j.Appender;
import org.apache.log4j.LogManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author Martin Anderson
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleThatLogsTest {

    @Mock
    private Appender mockAppender;
    @Captor
    private ArgumentCaptor captorLoggingEvent;

    @Before
    public void setup() {
        LogManager.getRootLogger().addAppender(mockAppender);
    }

    @After
    public void teardown() {
        //LogManager.getRootLogger().removeAppender(mockAppender);
    }

    @Test
    public void shouldConcatAndLog() {
        //given
        ExampleThatLogs example = new ExampleThatLogs();
        //when
        String result = example.concat("foo", "bar");
        //then
        assertEquals("foobar", result);

        //verify(mockAppender).doAppend(captorLoggingEvent.capture());
        //LoggingEvent loggingEvent = captorLoggingEvent.getValue();
        //Check log level
        //assertThat(loggingEvent.getLevel(), is(Level.INFO));
        //Check the message being logged
        //assertThat(loggingEvent.getRenderedMessage(),
                //is("String a:foo, String b:bar"));
    }
}
