package person;

import place.*;
import static enums.AreaType.*;

public abstract class Person implements Shorty, View {
    private String name;
    private boolean falling;
    private boolean thinking;

    public Person(String name) {
        this.name = name;
        //name = null;
        
        if (name.equals("Незнайка")) {
            //"Незнайка".equals(name);
            thinking = true;
        } else {
            thinking = false;
        }

        falling = false;
    }

    public void setFalling(boolean falling) {
        this.falling = falling;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean isFalling() {
        return falling;
    }

    @Override
    public boolean isThinking() {
        return thinking;
    }

    @Override
    public void getView(Location loc) {
        if(loc.getType() == SKY && loc.isLighting()) {
            System.out.println("Яркий свет резал глаза.");
        }
        if(loc.getType() == STREET) {
            System.out.println(name + loc.getEnvironment() + loc.getName() + ".");
        } else {
            System.out.println(loc.getEnvironment() + loc.getName() + ".") ;
        }

        if(loc.getType() == SKY && !loc.isVisible()) {
            System.out.println("Но внизу всё было в тумане.");
        }
    }
}
