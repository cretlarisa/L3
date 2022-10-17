import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> Noten_array = new ArrayList<Integer>();
        Noten obj = new Noten();
        Noten_array.add(84);
        Noten_array.add(29);
        System.out.println(obj.n_ausreichend(Noten_array)); // [29]
        System.out.println(obj.durchschnitt(Noten_array)); // 56.5
        System.out.println(obj.abgerund(Noten_array)); // [85, 29]
        System.out.println(obj.max(Noten_array)); // 85
    }
}