/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_sobrecargas_areas;

/**
 *
 * @author isaaczapatto
 */
public class EVA1_17_SOBRECARGAS_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El área es: " + area(5.5));
        System.out.println("El área es: " + area(22.9, 7.9876));
        System.out.println("El área es: " + area(3254.86, 1.1, 0.6));

        
    }
    public static double area(double radio){
        return Math.PI*radio*radio;
    }
    
    public static double area(double base, double altura){
        return (base*altura)/2.0;
    }
    
    public static double area(double base_mayor, double base_menor, double altura){
        return (altura*(base_mayor*base_menor))/2.0;
    }
            
}
