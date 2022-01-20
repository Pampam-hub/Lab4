//import java.util.Scanner;
import static enums.AreaType.*;

import exceptions.*;
import person.Donat;
import person.Dunno;
import person.Person;
import person.Scream;
import place.Location;

public class Story {

    public static void main(String[] args) throws EmptyException {
        //String name = new Scanner(System.in).next();

        Dunno dunno = new Dunno("Незнайка");
        Donat donat = new Donat("Пончик");

//        Location earth = new Location(true, true, EARTH, "Хорошо живется на территории под названием");
        Location tunnel = new Location(false, true, TONAL, "Всё круче уходил в глубь ");
        Location chasm = new Location(false, true, CHASM, "Просто-напросто падал в какую-то ");
        Location sky = new Location(true, false, SKY, "Над ним простиралось во все стороны светлое, словно покрытое волнистыми облаками ");
        Location town = new Location(false, true, TOWN, "Можно было разглядеть с его улицами и площадями ");
        Location street = new Location(false, true, STREET, " различал уже дома и пешеходов на ");
        Location village = new Location(false, true, VILLAGE, "Ветер нёс его туда, где были видны сады и огороды, где крыши домов утопали в зелени - ");
        Location[] locations = {tunnel, chasm, sky, town, street, village};

        class Viewer {
            Person observer;
            Location[] views;
            Viewer(Person p, Location[] v){
                observer = p;
                views = v;
            }
            public void doView() {
                for (Location location : views) {
                    observer.getView(location);
                }
            }
        }

        LookerForDunno.lookingForDunno("Пончик");

        donat.getLost();

        dunno.goOut("грота");
        dunno.goTo("тоннель");
        dunno.slip();

        Scream scream = new Scream() {
            @Override
            public void screamStart() {
                System.out.println("Крик Пончика раздался.");
            }

            @Override
            public void screamIgnored() {
                System.out.println("Крик Пончика был проигнорирован Незнайкой.");
            }
        };

        scream.screamStart();
        scream.screamIgnored();

        if (dunno.isFalling() && dunno.isThinking()) {
            new Viewer(dunno, locations).doView();
        } else {
            System.out.println("Никто не падает и не думает!");
        }


    }

    static class LookerForDunno {
        static void lookingForDunno(String looker) {
            if(looker.equals("Незнайка")) {
                throw new LookingForException("Незнайка не может сам себя искать.");
            }
            System.out.printf("%s бросился искать Незнайку.\n", looker);
        }
    }
}
