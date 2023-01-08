
/**
 * Write a description of class Vignere here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vignere
{
    // instance variables - replace the example below with your own
    private final static int ASIC = 65;
    private final static int MOD = 26;

    /**
     * Constructor for objects of class Vignere
     */
    public Vignere()    {}

    public static String encrypt(String plaintext, String keyword)
    {
        String key = generateKey(plaintext, keyword);
        
        String ciphertext = "";
        
        for (int i = 0; i < plaintext.length(); i++) {
            
            int x = Math.floorMod(plaintext.charAt(i) + key.charAt(i), MOD) + ASIC;
            
            ciphertext += (char)x;
        }        
        
        return ciphertext;
    }
    
    public static String decrypt(String ciphertext, String keyword)
    {
        String key = generateKey(ciphertext, keyword);
        
        String plaintext = "";
        
        for (int i = 0 ; i < ciphertext.length() && i < key.length(); i++)
        {
            // converting in range 0-25
            int x = Math.floorMod(ciphertext.charAt(i) - key.charAt(i) + 26, MOD) + ASIC;
     
            plaintext += (char)(x);
        }
        
        return plaintext;
    }

    // This function generates the key in
    // a cyclic manner until it's length isi'nt
    // equal to the length of original text
    static String generateKey(String str, String key)
    {
        int x = str.length();
     
        for (int i = 0; ; i++)
        {
            if (x == i)
                i = 0;
            if (key.length() == str.length())
                break;
            key+=(key.charAt(i));
        }
        return key;
    }

    
    
}
