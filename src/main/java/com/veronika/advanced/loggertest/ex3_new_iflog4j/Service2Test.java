package com.veronika.advanced.loggertest.ex3_new_iflog4j;


import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Service2Test {
    @Mock
    private Logger logger;

    private Service2 s2;

    @Before
    public void setup() {
        s2 = spy(new Service2());
        when(s2.logger()).thenReturn(logger);
    }

    @Test
    public void testServe() {
        s2.serve();
        verify(logger, times(1)).debug("I am a serve 2 method");
    }

}