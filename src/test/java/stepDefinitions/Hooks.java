package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@Netbanking")
    public void netBankingSetup() {
        System.out.println("setup netbanking");
    }

    @Before("@Mortage")
    public void mortageSetup() {
        System.out.println("setup mortage");
    }

    @After
    public void tearDown(){
        System.out.println(" we are done clear entries");
    }
}
// execution goes: before -> background -> Scenario -> after