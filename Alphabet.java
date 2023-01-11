import java.util.Map;
import java.util.LinkedHashMap;



public class Alphabet {
    private Pair[] alphabet;

    public Alphabet() {
        Map<K, V> result = new LinkedHashMap<>();
 
        alphabet = new Pair[26];
        alphabet[0] = new Pair('A');
        alphabet[1] = new Pair('B');
        alphabet[2] = new Pair('C');
        alphabet[3] = new Pair('D');
        alphabet[4] = new Pair('E');
        alphabet[5] = new Pair('F');
        alphabet[6] = new Pair('G'); 
        alphabet[7] = new Pair('H'); 
        alphabet[8] = new Pair('I');
        alphabet[9] = new Pair('J'); 
        alphabet[10] = new Pair('K'); 
        alphabet[11] = new Pair('L');
        alphabet[12] = new Pair('M');
        alphabet[13] = new Pair('N'); 
        alphabet[14] = new Pair('O');
        alphabet[15] = new Pair('P'); 
        alphabet[16] = new Pair('Q');
        alphabet[17] = new Pair('R');
        alphabet[18] = new Pair('S');
        alphabet[19] = new Pair('T');
        alphabet[20] = new Pair('U');
        alphabet[21] = new Pair('V'); 
        alphabet[22] = new Pair('W'); 
        alphabet[23] = new Pair('X');
        alphabet[24] = new Pair('Y'); 
        alphabet[25] = new Pair('Z');
    }

    public Pair[] getAlphabet() {
        return alphabet;
    }
    
    public Pair getEntry(int i) {
        return this.alphabet[i];
    }
}
