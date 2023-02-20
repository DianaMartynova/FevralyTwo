import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int massiv[] = {2, 87, 55, 5, 2, 1, 0, 32, 54};
        System.out.println(sortTreeSetMetod(massiv));
        System.out.println(sortHashSetMetod(massiv));

    }

    public static Set<Integer> sortTreeSetMetod(int[] massiv) {
        Set<Integer> sortMassiv = new TreeSet<>();
        for (int i = 0; i < massiv.length; i++) {
            sortMassiv.add(massiv[i]);
        }
        return sortMassiv;
    }

    public static Set<Integer> sortHashSetMetod(int[] massiv) {
        Set<Integer> sortHash = new HashSet<>();
        for (int i = 0; i < massiv.length; i++) {
            sortHash.add(massiv[i]);
        }
        return sortHash;
    }

}