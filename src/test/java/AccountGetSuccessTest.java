import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class AccountGetSuccessTest {
    private Account account;
    private  String name;


    @Test
    public void testAccountGetNameSuccess(){
        name = "Filipp Morris";
        account = new Account(name);
        Assert.assertEquals(name, account.getName());
    }
}


