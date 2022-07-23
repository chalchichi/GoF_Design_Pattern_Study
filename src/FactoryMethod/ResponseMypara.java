package FactoryMethod;

public class ResponseMypara implements Mypara{
    private String name;
    private String logo;
    private String user;
    public ResponseMypara(String user) {
        setname();
        setlogo();
        this.user = user;
    }

    @Override
    public void setname() {
        name = "res";
    }

    @Override
    public void setlogo() {
        name = "reslogo";
    }
}
