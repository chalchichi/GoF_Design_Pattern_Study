package FactoryMethod;

public interface MyparaFactory {

    private boolean authorization(String admin)
    {
        if(admin.equals("manager"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    default Mypara makeMypara(String type,String admin,String user)
    {
        if(!authorization(admin))
        {
            return null;
        };
        Mypara mypara = Makepara(user);
        return mypara;
    }

    boolean validation(String type);
    Mypara Makepara(String user);


}
