package stepDef;

import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends config {

    public static String baseURL;
    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    @Before
    public void beforeEachTest(){
        if (Strings.isNullOrEmpty(browserType)){
            browserType = "ch";
        }
        if (Strings.isNullOrEmpty(envType)) {
            envType = "qa";
        }
        driver = setupBrowser(browserType);
        switch (envType){
            case "qa":
                baseURL = "https://qa.taltektc.com";
            case "stage":
                baseURL = "https://stage.taltektc.com";
            case "prod":
                baseURL = "https://prod.taltektc.com";
                break;
        }
        driver.get(baseURL);

    }
    @After
    public void afterEachTest(){

    }
}
