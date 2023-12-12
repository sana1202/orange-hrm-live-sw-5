package resources.testdata;

import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.DataProvider;

public class TestDataForUsersTest extends BaseTest {
    @DataProvider(name = "data set")
    public Object[][] getdata()
    {
        Object [] [] data = new Object[][]
                {
                        { "Admin" , "Admin" , "Paul Collings" ,"Enable"},                         //4 columns so 4 variables
                        { "Cassidy.Hope" ,"ESS" ,"Cassidy Hope" ,"Enable" },
                        { "Nina.Patel" , "ESS" , "Nina Patel",  "Enable"},
                        {"Odis.Adalwin" ,"Admin", "Odis Adalwin", "Enable"}

                };
        return data;
    }
}
