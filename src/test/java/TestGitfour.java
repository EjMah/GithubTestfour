import org.junit.Assert;
import org.junit.Test;

public class TestGitfour {

    @Test
    public void Testing01(){
        Assert.assertTrue(true);
    }

    @Test
    public void Testing02(){
        Assert.assertTrue(true);
    }

    @Test
    public void Testing03(){
        Assert.assertTrue(true);
    }

    @Test
    public void TestCalc01(){
        int expected = 3+4;
        int actual = 7;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCalc02(){
        int expected = 3+2;
        int actual = 5;
        Assert.assertEquals(expected, actual);
    }

}
