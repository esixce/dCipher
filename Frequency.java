public class Frequency {  
    
    public Frequency() {}
    
    public static Pair[] getFrequency(String ciphertext) {
        
        //Array fr will store frequencies of element  
        Pair[] fr = new Pair[ciphertext.length()];
        int visited = -1;  
        for(int i = 0; i < ciphertext.length(); i++){  
            int count = 1;  
            for(int j = i+1; j < ciphertext.length(); j++){  
                if(ciphertext.charAt(i) == ciphertext.charAt(j)){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = new Pair((char)(i+65), visited);
                }  
            }  
            if(fr[i].getValue((char)(i+65)) != visited)  
                fr[i].setValue(count);  
        }  
        
        echoFrequency(fr, ciphertext, visited);
        
        return fr;
    }
    
    public static void echoFrequency(Pair[] fr, String ciphertext, int visited) {
        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i].getValue((char)(i+65)) != visited)  
                System.out.println("    " + ciphertext.charAt(i) + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }
}  