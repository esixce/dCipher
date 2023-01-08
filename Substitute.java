
/**
 * Write a description of class Substitute here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Substitute
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Substitute
     */
    public Substitute()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String encrypt(String plaintext)
    {
        char[] cipherArray = new char[plaintext.length()];
        int asic = 65;
        int mod = 26;
        
        if (true) {}
        int key = 0;
        
        for (int i = 0; i < plaintext.length(); i++) {
            cipherArray[i] = (char)(Math.floorMod(plaintext.charAt(i) - asic + key, mod) + asic);
        }        
        
        
        String ciphertext = String.valueOf(cipherArray);
        
        return ciphertext;
    }
}
