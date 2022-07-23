package FactoryMethod;

public class ResponesMyparaFactory implements MyparaFactory{


    @Override
    public Mypara Makepara(String user) {
        return new ResponseMypara(user);
    }

    @Override
    public boolean validation(String type) {
        if(type.equals("res"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
