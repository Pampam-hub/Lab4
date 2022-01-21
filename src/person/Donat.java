package person;

public class Donat extends Person {
    public Donat(String name) {
        super(name);
    }

    public void getLost() {
        System.out.printf("%s заблудился между ледяными колоннами.\n", getName());
    }
}

