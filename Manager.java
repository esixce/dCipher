import java.util.Scanner;

/**
 * Write a description of class Manager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manager
{
    public Manager() {}

    public static void runShift(String plaintext, int key) {
        
        String encrypt = Shift.encrypt(plaintext, key);
        System.out.println(encrypt + "\n");
        
        String cryptAnalysisShift = Shift.cryptanalysis(encrypt);
        System.out.println(cryptAnalysisShift);
        
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter the suspected key: ");  
        int userKey = sc.nextInt();    
        
        String decrypt = Shift.decrypt(encrypt, userKey);
        System.out.println(decrypt);
        
    }
    
    public static void runAffine(String plaintext, int key, int a) {
        String encrypt = Affine.encrypt(plaintext, key, a);
        System.out.println(encrypt);
        
        String decrypt = Affine.decrypt(encrypt, key, a);
        System.out.println(decrypt);        
    }
    
    public static void runVignere(String plaintext, String key) {
        String encrypt = Vignere.encrypt(plaintext, key);
        System.out.println(encrypt);
        
        String decrypt = Vignere.decrypt(encrypt, key);
        System.out.println(decrypt);        
    }
    
    public static void runHill(String plaintext, String key) {
        String encrypt = Hill.encrypt(plaintext, key);
        System.out.println(encrypt);        
        
        //String decrypt = Hill.decrypt(encrypt, key);
        //System.out.println(decrypt);                
    }
    
    
}
