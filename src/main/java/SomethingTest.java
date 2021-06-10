import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SomethingTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
@Test(priority = 3)
    public void Test3(){
    System.out.println("Test 3");
}
@Test(priority = 1)
    public void Test1(){
    System.out.println("Test1");
}
@Test(priority = 2)
    public void Test2a(){
    System.out.println("Test2a");
}
@Test(priority = 2)
    public void Test2b(){
    System.out.println("Test2b");
}
@AfterSuite
    public void AfterSuite(){
    System.out.println("After Suite");
}
}
