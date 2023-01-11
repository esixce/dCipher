
/**
 * Write a description of class Pair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pair {
    // instance variables - replace the example below with your own
    private char key;
    private double value;

    public Pair(char letter, double frequency) {
        this.key = letter;
        this.value = frequency;
    }

    public Pair(char letter) {
        this.key = letter;
    }
    
    public char getKey(double frequency) {
        return this.key;
    }
    
    public double getValue(char letter) {
        return this.value;
    }
    
    public void setKey(char letter) {
        this.key = letter;
    }
    
    public void setValue(double frequency) {
        this.value = frequency;
    }

}
