
import java.util.ArrayList;
import java.util.List;

public class Noten {

    public List<Integer> n_ausreichend(List<Integer> array){
        List<Integer> new_array = new ArrayList<Integer>();
        for(Integer note:array){
            if(note<40){
                new_array.add(note);
            }
        }
        return new_array;
    }

    public double durchschnitt(List<Integer> array){
        double summe = 0, nr = 0;
        double durch = 0;
        for(Integer note:array){
            summe += note;
            nr++;
        }
        durch = summe/nr; // int conversion in double
        return durch;
    }

    public List<Integer> abgerund(List<Integer> array){
        List<Integer> new_array = new ArrayList<Integer>();
        int nr=0;
        for(Integer note:array){
            if(note>38) {
                while (note % 5 != 0 && nr < 3) {
                    nr++;
                    note = note + nr;
                }
            }
            new_array.add(note);
        }
        return new_array;
    }

    public Integer max(List<Integer> array) {
//        List<Integer> new_array = new ArrayList<Integer>();
        int nr = 0;
        Integer max=0;
        for (Integer note : array) {
            if (note > 38) {
                while (note % 5 != 0 && nr < 3) {
                    nr++;
                    note = note + nr;
                }
                if(max<note){
                    max=note;
                }
            }
        }
        return max;
    }
}
