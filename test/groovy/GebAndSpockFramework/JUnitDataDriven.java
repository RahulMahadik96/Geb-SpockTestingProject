package GebAndSpockFramework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class JUnitDataDriven {
    String userName;
    boolean testResult;

    public JUnitDataDriven(String name,boolean result){

        userName=name;
        testResult=result;

    }

    @Parameterized.Parameters
    public static Collection primeNumbers(){

        return Arrays.asList(new Object[][]{{"abc@gmail.com",true},{"bcd@gmail.com",true},{"xyz@gmail.com", false}});
    }

    @Test
    public void testDataDriven(){

        System.out.println("User: "+userName+"  Result is: "+testResult);
    }


}
