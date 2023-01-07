
/**
 * Write a description of class Shift here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shift
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Shift
     */
    Shift(){}

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static String encrypt(String plaintext)
    {
        char[] cipherArray = new char[plaintext.length()];
                
        for (int i = 0; i < plaintext.length(); i++) {
            cipherArray[i] = plaintext.charAt(i);
        }        
        
        String ciphertext = String.valueOf(cipherArray);
        
        return ciphertext;
    }
    

}
