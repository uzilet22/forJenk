import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void test1(){
        Assert.assertTrue(Main.getTrue());
    }

    @org.junit.Test
    public void test2(){
        Assert.assertFalse(Main.getFalse());
    }
}
