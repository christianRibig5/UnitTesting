package profesional.test;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class PracticesCompositeTest {
    public static void main(String[]arg){
        Result result=JUnitCore.runClasses(AllTest.class);
        for(Failure failure:result.getFailures()){
            System.out.println(failure.toString());
        }
        if(result.wasSuccessful())System.out.println("All professional test passed");
    }
}