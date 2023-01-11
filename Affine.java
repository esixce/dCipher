
/**
 * Write a description of class Affine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Affine
{
    // instance variables - replace the example below with your own
    private final static int ASIC = 65;
    private final static int MOD = 26;

    /**
     * Constructor for objects of class Affine
     */
    public Affine()    {}

    public static String encrypt(String plaintext, int key, int a)
    {
        // Encrypt: e(x) = (ax + b) mod 26
        String ciphertext = "";

        for (int i = 0; i < plaintext.length(); i++) {
            ciphertext += (char)((Math.floorMod((a * plaintext.charAt(i) - ASIC + key) , MOD)) + 65);
        }

        return ciphertext;
    }

    public static String decrypt(String ciphertext, int key, int a)
    {
        // Decrypt: x = a^-1 * (y - b) mod 26       ax = y - b mod 26

        String plaintext = "";

        int inverse = findInverse(a);

        for (int i = 0; i < ciphertext.length(); i++) {
            int answer = Math.floorMod(inverse * (ciphertext.charAt(i) - 65 - key), 26) + ASIC;
            plaintext += (char)answer;
        }

        return plaintext;
    }

    public static int findInverse(int a) {
        int a_inv = 0;
        int flag = 0;
        //Find a^-1 (the multiplicative inverse of a
        //in the group of integers modulo m.)
        for (int i = 0; i < MOD; i++)
        {
            flag = (a * i) % MOD;

            // Check if (a*i)%26 == 1,
            // then i will be the multiplicative inverse of a
            if (flag == 1)
            {
                a_inv = i;
            }
        }
        return a_inv;
    }

    public static void cryptanalysis(String ciphertext) {

        Frequency.getFrequency(ciphertext);

        Alphabet frequencies = DBSim.letterFreq();
        
        frequencies
        


    }  

}
