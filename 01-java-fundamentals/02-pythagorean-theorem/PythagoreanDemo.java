import java.lang.Math;

public class PythagoreanDemo {
    
    public double calculateHypotenuse(int legA, int legB){
        double hypotenuse = (Math.sqrt(legA*legA))+(Math.sqrt(legB*legB));
        return hypotenuse; 
        }
    }