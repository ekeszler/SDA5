import java.util.HashMap;
import java.util.Map;

//Gaseste caracterul care se repeta de cele mai multe ori intr-un string
public class RepetitiveCharacterFinder {

    public static void main(String[] args) {
        String string = "abbbccdefgghhhh";
        RepetitiveCharacterFinder finder = new RepetitiveCharacterFinder();
        char mostRepetitiveChar = finder.findRepetitiveCharacter(string);
        System.out.println("Caracterul care se repeta cel mai des este " + mostRepetitiveChar);
    }

    public char findRepetitiveCharacter(String string){
        Map<Character, Integer> charFrequency = new HashMap<>();
        for(char character: string.toCharArray()){
            charFrequency.put(character, charFrequency.getOrDefault(character,0)+1);
        }
        char mostRepeatedChar = '\0';
        int maxFrequency = 0;

        for(Map.Entry<Character, Integer> entry: charFrequency.entrySet()){
            char character = entry.getKey();
            int frequency = entry.getValue();
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                mostRepeatedChar = character;
            }
        }
        return mostRepeatedChar;

    }

}
