
import java.util.Random;

/**
 *
 * @author pc109
 */
public class RandomObjectsCreator {
    
    int min = 10000;
    int max = 100000;
    int stringLength = 10;
    String nameCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
    RandomObject createRandomObject(){
        RandomObject object =  new RandomObject(randInt(min, max),randString(nameCharacters,stringLength) );     
        return object;
    }
    
    public static int randInt(int min, int max) {

        int random = (int )(Math.random() * max + min);
        return random;
    }
    
    public static String randString(String candidateChars, int length) {
        
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
        sb.append(candidateChars.charAt(random.nextInt(candidateChars
                .length())));
    }

    return sb.toString();
}
    
}
