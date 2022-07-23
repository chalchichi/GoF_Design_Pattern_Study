package FactoryMethod;

public class SorMyparaFactory implements MyparaFactory{
    @Override
    public Mypara Makepara(String user) {
        return new SorMypara(user);
    }

    @Override
    public boolean validation(String type) {
        if(type.equals("sor"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
