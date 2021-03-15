import org.testng.Assert;

public class Test {
    @org.testng.annotations.Test
    public void test1(){
        Assert.assertTrue(Main.getTrue());
    }

    @org.testng.annotations.Test
    public void test2(){
        Assert.assertFalse(Main.getFalse());
    }
}
