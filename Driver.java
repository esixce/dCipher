public class Driver {
    public static void main() {
        
        String plaintext = "the grass is green";
        System.out.println(plaintext);
        
        String shiftText = Shift.encrypt(plaintext);
        
        System.out.println(shiftText);
        
        char ch = 65;
        
        System.out.println(ch);
    
    }
}
