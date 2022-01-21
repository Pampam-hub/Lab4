package place;
import enums.AreaType;

public class Location {
    private boolean lighting;
    private boolean visible;
    private Area area;
    private String description;

    public Location(boolean lighting, boolean visible, AreaType type, String description) {
        this.lighting = lighting;
        this.visible = visible;
        this.area = new Area(type);
        this.description = description;
    }

    public boolean isLighting() {
        return lighting;
    }

    public boolean isVisible() {
        return visible;
    }

    public AreaType getType() {
        return area.getType();
    }

//    public String getEnvironment() {
//        return area.getEnvironment();
//    }
    public String getEnvironment() {
        return description;
    }

    public String getName() {
        return area.getName();
    }
}

