import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
     ArrayList<String> nameA = new ArrayList<>();
     ArrayList<String> nameB = new ArrayList<>();
     ArrayList<String> nameC = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 разных имён");
        for (int i = 0; i < 5; i++) {
            nameA.add(scanner.next());

        }


        System.out.println("Список А " + nameA);
        System.out.println("Введите 5 новых имён");
        for (int i = 0; i < 5; i++) {
            nameB.add(scanner.next());

        }

        System.out.println("Список B " + nameB );
        for (int i = 0; i < 5; i++) {
            nameC.add(nameA.get(i));
            nameC.add(nameB.get(i));

        }

        System.out.println("Список С " + nameC);
        Collections.sort(nameC, Comparator.comparing(String :: length));
        System.out.println("Сортировка по длине строк " + nameC);
// Mak Trevor Sasha Tanya Berserk
// Franklin John Toni Stark Benzemi



    }
}