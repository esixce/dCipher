
public class Shift {
    private final static int ASIC = 65;
    private final static int MOD = 26;

    /**
     * Constructor for objects of class Shift
     */
    Shift(){}

    public static String encrypt(String plaintext, int key)
    {
        String ciphertext = "";
        
        for (int i = 0; i < plaintext.length(); i++) {
            ciphertext += (char)(Math.floorMod(plaintext.charAt(i) - ASIC + key, MOD) + ASIC);
        }        
                
        return ciphertext;
    }
    
    public static String decrypt(String ciphertext, int key)
    {
        String plaintext = "";
        
        for (int i = 0; i < ciphertext.length(); i++) {
            plaintext += (char)(Math.floorMod((ciphertext.charAt(i) - ASIC) - key, MOD) + ASIC);
        }        
        
        return plaintext;
    }

    public static String cryptanalysis(String ciphertext) {
        String report = "";
        String shiftArray[] = new String[26];
        for (int i = 0; i < ciphertext.length(); i++) {
            report += decrypt(ciphertext, i+1) + "\n";
            //System.out.println(shiftArray[i]);
        }        
        //System.out.println(report);
        return report;
    }
    
    
}
