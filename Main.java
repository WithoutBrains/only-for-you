import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<AEnemy> enemyList = new ArrayList<AEnemy>();
        enemyList.add(new Zerg("Зергов", (float) 5.4));
        enemyList.add(new Zerg("Зергович", 6));

        enemyList.add(new Protoss("Протосерян", 3));
        enemyList.add(new Protoss("Посерянов", 8));

        enemyList.add( new Terran("Терарисимус", 4));
        enemyList.add(new Terran("Терранус", 7));

        for(AEnemy o : enemyList) {
            System.out.println(o);
        }

        System.out.println("--------");

        Collections.sort(enemyList, new Comparator<AEnemy>(){
            public int compare(AEnemy o1, AEnemy o2){
                if(o1.y == o2.y)
                    return 0;
                return o1.y < o2.y ? -1 : 1;
            }
        });

        for(AEnemy o : enemyList) {
            System.out.println(o);
        }

    }
}