package me.seanksmith.jobfinder;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StandardResponseTest {
    @Test
    public void testAddError() {
        StandardResponse sr = new StandardResponse();
        sr.addError(RESPONSE_ERROR.UNEXPECTED);
        assertTrue(sr.getErrors().size() > 0);
    }
}
