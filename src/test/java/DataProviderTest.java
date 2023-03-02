import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {


        @DataProvider
        public Object[][] dpMethod(){
            return new Object[][] {{2, 3 , 5}, {5, 8, 11}};
        }

        @Test(dataProvider = "dpMethod")
        public void myTest (int a, int c, int result) {
            int sum = a + c;
            Assert.assertEquals(result, sum) ;

    }
}
