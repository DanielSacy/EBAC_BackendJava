package test;

import main.ClientTesting;

import org.junit.Assert;
import org.junit.Test;

public class TestClientTesting {
    @Test
    public void testClientClass () {
        ClientTesting testClient = new ClientTesting();
        testClient.setName("Daniel");
        Assert.assertEquals("Daniel", testClient.getName());
    }
}
