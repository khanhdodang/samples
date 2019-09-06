import androidApp.Android_app;
import androidApp.TestRunner_android_app;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import iosApp.Ios_app;
import iosApp.TestRunner_ios_app;
import iosWeb.Ios_web;
import iosWeb.TestRunner_ios_web;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({ TestRunner_android_app.class, TestRunner_ios_app.class, TestRunner_ios_web.class})
public class RunCucumberTest {
    @Test
    public void test() {
        Class[] cls = { TestRunner_android_app.class, TestRunner_ios_app.class  ,TestRunner_ios_web.class};

        // Parallel among classes
        JUnitCore.runClasses(ParallelComputer.classes(), cls);

        System.out.println("----------------------------");

//        // Parallel among methods in a class
//        JUnitCore.runClasses(ParallelComputer.methods(), cls);
//
//        System.out.println("----------------------------");

        // Parallel all methods in all classes
        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
    }
}