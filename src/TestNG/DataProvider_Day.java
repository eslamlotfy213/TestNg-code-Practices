package TestNG;

import org.testng.ITestListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Day {




    @Test(dataProvider = "getData")
    public void DemoApi ( String fname, String lastname)
    {

        System.out.println("Api");
        System.out.println(fname);
        System.out.println(lastname);
    }



    @DataProvider
    public  Object[][] getData(){
        Object [][] data= new Object[3][2];

        data[0][0]="onefirstname";
        data[0][1]="onepassword";


        data[1][0]="twofirstname";
        data[1][1]="twopassword";


        data[2][0]="threefirstname";
        data[2][1]="threepassword";
        return data;
    }


    public static class Listeners implements ITestListener {







    }
}
