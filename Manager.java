import java.util.Scanner;

/**
 * Write a description of class Manager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manager {
    public Manager() {}

    public static void runSwitch() {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  

        int encryptType = 0;
        while (encryptType != 9) {
            System.out.print("Enter the message: ");
            String input = sc.next().toUpperCase();

            System.out.print("1) Encrypt \n2) Decrypt \n3) Analysis\n");
            int operation = sc.nextInt();

            System.out.println(displayMenu());
            encryptType = sc.nextInt();

            if (encryptType == 1) {             // shift
                runShift(input, operation);
            } else if (encryptType == 2) {      // affine
                runAffine(input, operation);
            } else if (encryptType == 3) {      // vignere
                runVignere(input, operation);
            } else if (encryptType == 4) {      // hill
                runHill(input, operation);
            } else if (encryptType == 5) {      // permutation
                runPerm(input, operation);
            } else if (encryptType == 9) {      // EXIT
                System.out.print("Bye");
            } else {
                System.out.print("wrong choice");
            }    
        }
    }

    public static String displayMenu() {
        String output = "";
        String[] cipherTypes = {"Shift", "Affine", "Vignere", "Hill", "Permutation"};
        for(int i = 0; i < 5; i++) {
            output += (i+1) + ") " + cipherTypes[i] + "\n";
        }
        output += "9) Quit\n";

        output += "Enter the desired cipher: ";

        return output;
    }

    public static void runShift(String input, int operation) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        if(operation == 1 || operation == 2) {   
            System.out.print("Enter the key: ");
            int key = sc.nextInt();
            if(operation == 1) {            // encrypt
                String encrypt = Shift.encrypt(input, key);
                System.out.println(encrypt + "\n");
            } else if (operation == 2){     // decrypt
                String decrypt = Shift.decrypt(input, key);
                System.out.println(decrypt);
            }
        }
        if (operation == 3){     // analysis
            String cryptAnalysisShift = Shift.cryptanalysis(input);
            System.out.println(cryptAnalysisShift);
            System.out.print("Enter the suspected key: ");  
            int userKey = sc.nextInt();    
            String decrypt = Shift.decrypt(input, userKey);
            System.out.println(decrypt);
        }
    }

    public static void runAffine(String input, int operation) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        if(operation == 1 || operation == 2) {   
            System.out.print("ax + b where a prime");
            System.out.print("Enter the desired a: ");
            int a = sc.nextInt();
            System.out.print("Enter the desired b: ");
            int key = sc.nextInt();
            if(operation == 1) {            // encrypt
                String encrypt = Affine.encrypt(input, key, a);
                System.out.println(encrypt);
            } else if (operation == 2){     // decrypt
                String decrypt = Affine.decrypt(input, key, a);
                System.out.println(decrypt);        
            } 
        } 
        if (operation == 3){     // analysis
            
            Affine.cryptanalysis(input);
            
        }
    }

    public static void runVignere(String input, int operation) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter the desired keyword: ");
        String keyword = sc.next();
        if(operation == 1) {            // encrypt
            String encrypt = Vignere.encrypt(input, keyword);
            System.out.println(encrypt);
        } else if (operation == 2){     // decrypt
            String decrypt = Vignere.decrypt(input, keyword);
            System.out.println(decrypt);
        } else if (operation == 3){     // analysis
        }
    }

    public static void runHill(String input, int operation) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter the desired a: ");
        boolean alphaZero = true;
        String keyword = sc.next();
        if(operation == 1) {            // encrypt
            Hill.encrypt(input, alphaZero);
            //System.out.println(encrypt);        
        } else if (operation == 2){     // decrypt
            Hill.decrypt(input, alphaZero);
            //System.out.println(decrypt);                
        } else if (operation == 3){     // analysis

        }
    }

    public static void runPerm(String input, int operation) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        //System.out.print("Enter the desired key: ");
        //String keyword = sc.next();
        boolean keyword = true;
        if(operation == 1) {            // encrypt
            Permutation cp = new Permutation();
            System.out.println(cp.encrypt(input));        
        } else if (operation == 2){     // decrypt
            Permutation cp = new Permutation();
            System.out.println(cp.decrypt(input));        
        } else if (operation == 3){     // analysis

        }
    }
}
