package CPTemplate;

import java.util.Comparator;

public class CPTemplate {
    //pair class
    static class Pair{
        int weight;int value;
        Pair(int value, int weight){
            this.weight = weight;
            this.value = value;
        }
    }
    //sorting an array of non primitive type
    static class PairComparator implements Comparator<Pair>{
        public int compare(Pair a, Pair b){
            double r1 = (double)a.value/(double)a.weight;
            double r2 = (double)b.value/(double)b.weight;
            if(r1<r2)return 1;
            else if(r1>r2) return -1;
            return 0;
        }
    }
    public static void main(String[] args) {
        
    }
}
