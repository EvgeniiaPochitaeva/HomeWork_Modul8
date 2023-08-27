package homeworkmodul8;

interface Baza {
    String getName();
    }
public abstract class Shape implements Baza{
    private String name;
    public Shape () {
    }
    public Shape (String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void  setName(String name) {
        this.name=name;
    }


}




