import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private final String name;

    private Pattern pattern = Pattern.compile("(?=^[a-zA-Z]*\\s[a-zA-Z]*$)(^.{3,19}$)");

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }

    public String getName() {
        return name;
    }


}
