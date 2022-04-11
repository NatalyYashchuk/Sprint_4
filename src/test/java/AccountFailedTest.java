import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountFailedTest {
    private Account account;
    private final String name;

    public AccountFailedTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters (name = "{0}")
    public static Object[][]  getAccountTestData(){
    return new Object[][] {
            {" Helen Store"},
            {"Helen Store "},
            {"HelenStore"},
            {"Heeeeeeeeeelen Store"},
            {"HS"},
        };
    }

    @Test
public void testAccountNameFalse(){
    account = new Account(name);
        Assert.assertFalse(account.checkNameToEmboss());
    }
}
