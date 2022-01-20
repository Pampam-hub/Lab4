package place;

import enums.AreaType;

public class Environment {
    private static String environment;

    public static void setEnvironment(AreaType type) {
        switch (type) {
            case TONAL:
                environment = "Всё круче уходил в глубь Луны ";
                break;
            case CHASM:
                environment = "Просто-напросто падал в какую-то ";
                break;
            case SKY:
                environment = "Над ним простиралось во все стороны светлое, словно покрытое волнистыми облаками ";
                break;
            case TOWN:
                environment = "Можно было разглядеть с его улицами и площадями ";
                break;
            case STREET:
                environment = " различал уже дома и пешеходов на ";
                break;
            case VILLAGE:
                environment = "Ветер нёс его туда, где были видны сады и огороды, где крыши домов утопали в зелени - ";
                break;
            case EARTH:
                environment = "Хорошо живется на территории под названием ";
                break;
            default:
                environment = "Такого места в истории не найдено";
        }
    }

    public static String getEnvironment() {
        return environment;
    }

}
