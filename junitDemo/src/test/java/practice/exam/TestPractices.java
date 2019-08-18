package practice.exam;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestPractices {
    public static void main(String[]arg){
        Result result=JUnitCore.runClasses(AllPractices.class);
        for(Failure failure:result.getFailures()){
            System.out.println(failure.toString());
        }
        if(result.wasSuccessful())System.out.println("All practice test passed");
    }
}