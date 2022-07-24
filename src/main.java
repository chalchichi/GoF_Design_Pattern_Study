import FactoryMethod.*;

public class main {
    public static void main(String[] args) {
        Setup setup = new Setup();
        setup.printparameter(new ResponesMyparaFactory(),"manager","oh","res");
        setup.printparameter(new SorMyparaFactory(),"manager","oh","sor");
        setup.printparameter(new SorMyparaFactory(),"manager","oh","1");
    }
}
