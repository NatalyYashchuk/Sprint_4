public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        // проверка длины
        if(name.length() <3 || name.length() > 19) return  false;

        return name.matches("^[a-zA-Z]* [a-zA-Z]*$");

    }

    public String getName() {
        return name;
    }


}
