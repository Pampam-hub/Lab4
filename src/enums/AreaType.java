package enums;

public enum AreaType {
    TONAL("Тоннель"),
    CHASM("Пропасть"),
    SKY("Небо"),
    TOWN("Город"),
    STREET("Улица"),
    VILLAGE("Окраина");

    private final String name;

    AreaType(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
