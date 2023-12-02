package StackQueue.ImplementProblem;

public class celebrity {
    public static void main(String[] args) {
        int n = 5; 
        System.out.println(findCelebrity(n));
    }
    public static int findCelebrity(int n) {
        // Write your code here.
		for(int i=0; i<n; i++){
			boolean cel = true;
			for(int j=0; j<n; j++){
				if(j!=i){
					if(knows(i,j)){
						cel = false;
						break;
					}
				}
			}
			if(cel==true){
				for(int j=0; j<n; j++){
					if(j!=i){
						if(knows(j,i)==false){
							cel=false;
							break;
						}
					}
				}
			}
			if(cel==true)return i;
		}
		return -1;
    }
    public static boolean knows(int i, int j){
        if(i%2==0)return true;
        return false;
    }
}
