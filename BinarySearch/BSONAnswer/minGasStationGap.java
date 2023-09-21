package BinarySearch.BSONAnswer;
import java.util.*;



public class minGasStationGap {
    public static class Pair {
        double first;
        int second;

        Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static double MinimiseMaxDistance2(int []arr, int K){
        double low = 0;
        double high = 0;
        int n = arr.length; 
        for(int i=0; i<n-1; i++){
            high = Math.max(high, (double)(arr[i+1]-arr[i]));
        }

        double diff = 1e-6;
        while((high-low)>diff){
            double mid = (high+low)/(2.0);
            int cnt = numberOfGasStationRequired(mid, arr);
            if(cnt>K) low = mid;
            else high = mid;
        }
        return high;
    }

    public static int numberOfGasStationRequired(double gap, int[] arr){
        int cnt = 0;
        int n = arr.length;
        for(int i=1; i<n; i++){
            int numberInBetween = (int)((arr[i]-arr[i-1])/gap);
            if((arr[i]-arr[i-1])==(numberInBetween*gap)){
                numberInBetween--;
            }
            cnt+=numberInBetween;
        }
        return cnt;
    }

    public static double MinimiseMaxDistance1(int []arr, int K){
        int n = arr.length;
        int[] howMany = new int[n-1];
        Arrays.fill(howMany,0);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b)-> Double.compare(b.first, a.first));
        for(int i=0; i<n-1; i++){
            pq.add(new Pair(arr[i+1]-arr[i], i));
        }

        for(int gasStation=1; gasStation<=K; gasStation++){
            Pair tp = pq.poll();
            int secInd = tp.second;
            howMany[secInd]++;
            double diff = arr[secInd+1]-arr[secInd];
            double newSection = diff/(double)(howMany[secInd]+1);
            pq.add(new Pair(newSection, secInd));
        }
        return pq.peek().first;
    }
    public static void main(String[] args) {
        
    }

    public static double MinimiseMaxDistance(int []arr, int K){
        // Write your code here.
        int n = arr.length;
        int[] howMany = new int[n-1];
        Arrays.fill(howMany,0);
        for(int gasStation=1; gasStation<=K; gasStation++){
            double maxSection=-1;
            int maxInd = -1;
            for(int i=0; i<n-1; i++){
                double diff = (arr[i+1]-arr[i]);
                double sectionLengthj = diff/(double)(howMany[i]+1);
                if(sectionLengthj>maxSection){
                    maxSection = sectionLengthj;
                    maxInd=i;
                }
            }
            howMany[maxInd]++;
        }
        double maxAns = -1;
        for(int i=0; i<n-1; i++){
            double diff = (arr[i+1]-arr[i]);
            double sectionLengthj = diff/(double)(howMany[i]+1);
            maxAns = Math.max(maxAns,sectionLengthj);
        }
        return maxAns;
    }

    
}
