package place;

import enums.AreaType;

public abstract class Nameable {
    private String name;

    public Nameable(AreaType type) {
        switch (type) {
            case TONAL:
                name = "Тоннель";
                break;
            case CHASM:
                name = "Пропасть";
                break;
            case SKY:
                name = "Небо";
                break;
            case TOWN:
                name = "Город";
                break;
            case STREET:
                name = "Улица";
                break;
            case VILLAGE:
                name = "Окраина";
                break;
            case EARTH:
                name = "Земля";
                break;
            default:
                name = "Такого места в истории не найдено";
        }
    }

    public String getName() {
        return name;
    }

}

