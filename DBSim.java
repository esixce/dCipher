public class DBSim {
    public DBSim() {
        String[] digrams = {"TH", "HE", "IN", "ER", "AN", "RE", "ED", "ON", 
                            "ES", "ST", "EN", "AT", "TO", "NT", "HA", "ND", 
                            "OU", "EA", "NG", "AS", "OR", "TI", "IS", "ET", 
                            "IT", "AR", "TE", "SE", "HI", "OF"};
        
        String[] trigrams = {"THE", "ING", "AND", "HER", "ERE", "ENT", "THA", 
                             "NTH", "WAS", "ETH", "FOR", "DTH"};
    }

    public static Alphabet letterFreq() {
        
        Alphabet alphabet = new Alphabet();
        
        double[] freqx = {0.082, 0.015, 0.028, 0.043, 0.0127, 0.022, 0.020, 0.061, 
                        0.07, 0.002, 0.008, 0.04, 0.024, 0.067, 0.075, 0.019, 0.001, 
                        0.06, 0.063, 0.091, 0.028, 0.01, 0.023, 0.001, 0.02, 0.001};
                        
        for(int i = 0; i < alphabet.getAlphabet().length; i++) {
            alphabet.getEntry(i).setValue(freqx[i]);
        }
        
        return alphabet;
    }
}
