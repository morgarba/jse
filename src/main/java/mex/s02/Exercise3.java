package mex.s02;

public class Exercise3 {
    /**
     * Engine capacity
     * 
     * @param bore   in mm
     * @param stroke in mm
     * @param nr     number of cylinders
     * @return the engine capacity in cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
    
    
    return Math.PI * Math.pow(bore/2, 2) * nr * stroke /1000;     
  
    }
}
