import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Smit on 20-01-17.
 */
public class ShopTest {
    @Test
    public void itemGetNameTest(){
        Item pear = new Item ("washington pear", 1.5);
        Assert.assertTrue("pear name should be washington pear", pear.getName().equals("washington pear"));
    }

    @Test
    public void itemPriceForTest(){
        Item pear = new Item ("washington pear", 1.5);
        Assert.assertTrue("pear name should be washington pear", pear.priceFor(2) == (3)); //primitive type
    }




    }
