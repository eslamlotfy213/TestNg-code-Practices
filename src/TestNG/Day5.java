package TestNG;

import org.testng.annotations.*;

public class Day5 {

    @BeforeTest
    public void BTest()
    {

        System.out.println(" Before Test ..................");
    }


    @AfterTest
    public void ATest()
    {

        System.out.println(" After Test ..................");

    }

    @BeforeClass
    public void beforeclass(){

        System.out.println("before class level");
    }


    @Parameters({"Url"})
    @Test
    public void DemoWeb (String uname) {

        System.out.println("Amazon");
        System.out.println(uname);
    }

    @Test
    public void DemoApi () {

        System.out.println("Api");
    }


     @BeforeMethod
     public void beforemethod(){
         System.out.println("before each test");

     }

    @AfterMethod
    public void afteremethod(){
        System.out.println("after each test");

    }


    @AfterClass
    public void aftereclass(){
        System.out.println("after class level");
    }


}
