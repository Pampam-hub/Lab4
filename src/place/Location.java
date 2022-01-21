package place;

import enums.AreaType;

public class Location {
    private boolean lighting;
    private boolean visible;
    private AreaType type;
    private String description;
    private String name;

    public Location(boolean lighting, boolean visible, AreaType type, String description) {
        this.lighting = lighting;
        this.visible = visible;
        this.type = type;
        this.description = description;
        name = type.getName();
    }

    public boolean isLighting() {
        return lighting;
    }

    public boolean isVisible() {
        return visible;
    }

    public AreaType getType() {
        return type;
    }

    public String getEnvironment() {
        return description;
    }

    public String getName(){
        return name;
    }


}
