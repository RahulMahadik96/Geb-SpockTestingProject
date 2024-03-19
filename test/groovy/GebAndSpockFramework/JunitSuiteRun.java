package GebAndSpockFramework;


//import org.junit.jupiter.api.parallel.Execution;
//import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@Execution(ExecutionMode.CONCURRENT)
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SpockTest.class,
        GebWithJunit01.class
})
public class JunitSuiteRun {

}
