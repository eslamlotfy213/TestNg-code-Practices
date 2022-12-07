package TestNG;


import org.testng.annotations.Test;

public class Day1 {



    @Test(groups = {"smoke"})
    public void Demo1 () {
        System.out.println("hello as requirment user havw 100 TC  needs onyl run 40TC > using grouping ");
    }

    @Test
    public void Demo2 () {
        System.out.println("Good bye");
    }



}


