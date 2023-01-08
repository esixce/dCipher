public class Driver {
    public static void main() {
        
        //String input = "wewillmeetatmidnight";
        //String input = "hot";
        //String input = "GEEKSFORGEEKS";
        //String input = "thiscryptosystemisnotsecure";
        String input = "ACT";
        
        //String keyword = "AYUSH";
        //String keyword = "CIPHER";
        String keyword = "GYBNQKURP";
        
        String plaintext = input.toUpperCase();
        int key = 3;
        int a = 7;
        
        System.out.println(plaintext + "\n");
        
        //System.out.println("a " + a);
        //System.out.println("b " + key);
        
        //Manager.runShift(plaintext, key);
        //Manager.runAffine(plaintext, key, a);
        //Manager.runVignere(plaintext, keyword);
        Manager.runHill(plaintext, keyword);
        
    }
}
