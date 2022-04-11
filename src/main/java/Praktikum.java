import org.junit.Assert;

public class Praktikum {

    public static void main(String[] args) {
        String nameToEmboss = "Yurij Sazonov";
        Account embossEccount = new Account(nameToEmboss);
        Assert.assertTrue(embossEccount.checkNameToEmboss());
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }

}
