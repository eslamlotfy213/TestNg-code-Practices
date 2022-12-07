package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3 {


    @Test(enabled = false)
    public void DemoDemoDeomFalse () {
        System.out.println(" application have error needs to skip that > usging enable = false");
    }

    @Test
    public void DemoDemoDeomTrue () {
        System.out.println("application have error needs to skip that > usging enable = false");
    }


    @Test
    public void ListerneceDemo () {

        System.out.println("ListerneceDemo");
        Assert.assertTrue(false);
    }


    @Test
    public void DemoWeb () {
        System.out.println("Web");
    }

    @Test
    public void DemoMobile () {
        System.out.println("Mobile");
    }

    @Test
    public void DemoApi () {
        System.out.println("Api");
    }


}
