import org.junit.Assert;

public class Praktikum {

    public static void main(String[] args) {
        String nameToEmboss = "Yurij Sazonov";
        Account embossEccount = new Account(nameToEmboss);
        Assert.assertTrue(embossEccount.checkNameToEmboss());
    }

}
