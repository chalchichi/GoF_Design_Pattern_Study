package FactoryMethod;

public class Setup {

    public void printparameter(MyparaFactory myparaFactory,String admin, String user , String type)
    {
        Mypara parameter = myparaFactory.makeMypara(type,admin,user);
        System.out.println(parameter);
    }
}
