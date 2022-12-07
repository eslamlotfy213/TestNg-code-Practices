package TestNG;

import org.testng.annotations.*;

public class Day6 {



    @Parameters({"Url"})
    @Test
    public void DemoWeb (String urlname) {

        System.out.println("Web");
        System.out.println("Url :"+ urlname);
    }

    @Test
    public void DemoApi () {

        System.out.println("Api");
    }



}
