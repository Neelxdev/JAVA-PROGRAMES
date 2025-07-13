import java.util.Arrays;
public class matchingPlayerTrainer {
    static int matching(int[] players, int[] trainers){
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0, j = 0, match = 0;
            while(i < players.length && j < trainers.length){
            if(players[i] <= trainers[j]){
                match++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return match;
    }   
    public static void main(String[] args) {
        int[] players = {4, 7, 9};
        int[] trainers = {8, 2, 5, 8};
        int result = matching(players, trainers);
        System.out.println(result); 
    }    
    
}
