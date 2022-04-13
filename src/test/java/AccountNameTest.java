import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountNameTest {
    private Account account;
    private final String name;
    private final Boolean checkName;

    public AccountNameTest(String name, Boolean checkName) {
        this.name = name;
        this.checkName = checkName;
    }

    @Parameterized.Parameters (name = "{0} {1}")
    public static Object[][]  getAccountTestData(){
    return new Object[][] {
            {"H S", true},
            {"H Sa", true},
            {"Filipp Morris", true},
            {"Elizabeth Nortingal", true},
            {"Elizabeth Nortinga", true},
            {"Elizabeth Nortingale", false},
            {"HS", false},
            {" Helen Store", false},
            {"Helen Store ", false},
            {"HelenStore", false},
        };
    }

    @Test
public void testAccountNameFalse(){
    account = new Account(name);
    Assert.assertEquals("Name isn't as required", checkName, account.checkNameToEmboss());

    }
}
