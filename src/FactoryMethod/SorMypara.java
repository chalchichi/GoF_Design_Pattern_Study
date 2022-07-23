package FactoryMethod;

public class SorMypara implements Mypara{
    private String name;
    private String logo;
    private String user;
    public SorMypara(String user) {
        setname();
        setlogo();
        this.user = user;
    }

    @Override
    public void setname() {
        name = "sor";
    }

    @Override
    public void setlogo() {
        name = "sorlogo";
    }
}
