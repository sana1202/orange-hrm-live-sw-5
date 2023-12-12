package resources.testdata;

import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.DataProvider;

public class TestDataForLoginTest extends BaseTest {
    @DataProvider(name = "data set")
    public Object[][] getdata()
    {
        Object [] [] data = new Object[][]
                {
                        { " " , " " , "Required"},                                            //3 columns so 3 variables
                        { "test123@gmail.com" ," " ,"Required" },
                        { " " , "test123" ,   "Required"},
                        {"test123@gmail.com" ,"test123",  "Invalid credentials"}             //4 rows .... 4 times execution

                };
        return data;
    }
}
