import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Găsește o pereche de numere dintr-un array astfel încât suma lor să fie egală cu o anumită valoare dată x.
public class FindSumPairs {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int targetSum = 7;
        int[] pair = checkSumPairs(numbers, targetSum);
        if(pair != null){
            System.out.println("perechea care are suma " + targetSum + " este: " + Arrays.toString(pair));
        }else{
            System.out.println("Nu s-a gasit nicio pereche care sa aibe suma " + targetSum);
        }
    }

    public static int[] checkSumPairs(int[] numbers, int targetSum){
        Set<Integer> complements = new HashSet<>();
       for(int num:numbers){
           int complement = targetSum - num;
           if(complements.contains(complement)){
               return new int[]{complement, num};
           }
           complements.add(num);
       }
       return null;
    }
}
