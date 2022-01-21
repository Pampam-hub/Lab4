package person;

import exceptions.EmptyException;

public class Dunno extends Person{
    public Dunno(String name) {
        super(name);
    }

    public void goOut(String whereFrom) throws EmptyException {
        if(whereFrom.equals("")) {
            throw new EmptyException("Нет пункта отправления.");
        }
        System.out.printf("%s вышел из %s.\n", getName(), whereFrom);
    }

    public void goTo(String whereTo) throws EmptyException {
        if(whereTo.equals("")) {
            throw new EmptyException("Нет пункта назначения.");
        }
        System.out.printf("%s попал в %s.\n", getName(), whereTo);
    }

    public void slip() {
        System.out.printf("%s поскользнулся и полетел вниз.\n", this.getName());
        this.setFalling(true);
    }
}

