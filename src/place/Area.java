package place;

import enums.AreaType;

public class Area extends Nameable {
    private AreaType type;
    private String name;
    private String environment;

    public Area(AreaType type) {
        super(type);
        name = super.getName();
        this.type = type;
        Environment.setEnvironment(type);
        environment = Environment.getEnvironment();
        
    }

    public AreaType getType() {
        return type;
    }

    public String getEnvironment() {
        return environment;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Человек '" + name + "'.";
    }

    @Override
    public boolean equals (Object obj) {
        if(!(obj instanceof Area)) {
            return false;
        } else {
            Area a = (Area)obj;
            return this.name.equals(a.name);
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 10;
    }

    /*
    public void Proba() {

        Story.main(new String[]{"b", "c"});
        equals(this);
    }
    */
    
}
