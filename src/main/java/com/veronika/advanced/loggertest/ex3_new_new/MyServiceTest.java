package com.veronika.advanced.loggertest.ex3_new_new;
//
//import org.apache.log4j.Appender;
//import org.apache.log4j.Level;
//import org.apache.log4j.Logger;
//import org.apache.log4j.spi.LoggingEvent;

import org.apache.log4j.Appender;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.LoggingEvent;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MyServiceTest {

    @Mock
    private Appender mockAppender;

    @Captor
    private ArgumentCaptor<LoggingEvent> captorLoggingEvent;

    @Spy
    @InjectMocks
    private MyService ms;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        final Logger logger = LoggerFactory.getLogger(MyService.class);
       // logger.(mockAppender);
    }

//    @After
//    public void teardown() {
//        final Logger logger = Logger.getRootLogger();
//        logger.removeAppender(mockAppender);
//    }

    @Test
    public void testServe() {
        ms.serve();

        captorLoggingEvent = ArgumentCaptor.forClass(LoggingEvent.class);

        //verify(mockAppender).doAppend(captorLoggingEvent.capture());
        //assertEquals("John", argument.getValue().getName());

        final LoggingEvent loggingEvent = captorLoggingEvent.getValue();
       // assertThat(loggingEvent.getLevel(), is(Level.DEBUG));
        assertThat(loggingEvent.getMessage(),
                is("I am a log method"));
        //assertNull(loggingEvent.g);
    }
}
