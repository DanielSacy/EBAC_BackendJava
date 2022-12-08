package test;

import org.junit.*;

public class SecondTest {
    @Test
    public void testNotEquals() {
        String nome = "Daniel";
        Assert.assertNotEquals("DaNiel", nome);
    }
}
