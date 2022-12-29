/**
 * I developed a program called Weather. This program utilizes arrays list and does some conversion based on user inputs.
 * Conversion = celcius to fahrenheit and fahrenheit to celcius. 
 */
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, What is your name?");
        String name = scan.nextLine();
        System.out.println(name + "! Nice to meet you." + " My name is Derek Osborne, a Software Engineer.");
        System.out.println("I developed a little program called Weather(Temperature). It will convert celcius to fahrenheit and vise versa.");
        System.out.println("Hope you enjoy.");
        
        double[] celsius = new double[1];
       
        
        for(int i = 0; i < celsius.length; i++){
            System.out.println(name + " What is the temperature for Today in Celcius?");
            celsius[i] = scan.nextDouble();
        }
        System.out.println(" ");
        double[] fahrenheit = celsiusToFahrenheit(celsius);
        

        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");

        double[] Fahrenheit = new double[1];
        for(int i = 0; i < fahrenheit.length; i++){
            System.out.println(name + " What is the temperature for Today in Fahrenheit?");
            fahrenheit[i] = scan.nextDouble();
            
            scan.close();
        }
        System.out.println(" ");
        double[] celcius = fahrenheitToCelsius(fahrenheit);

        printTemperatures(fahrenheit, "Fahrenheit");
        printTemperatures(celcius, "Celcius");



        
    }
    public static double[] celsiusToFahrenheit(double[] celsius){
        
        double[] fahrenheit = new double[celsius.length];
        for(int i = 0; i < fahrenheit.length; i++){
            fahrenheit[i] = (celsius[i] * 9 / 5) + 32;
        }
        return fahrenheit;
    }



    
    public static double[] fahrenheitToCelsius(double[] fahrenheit){
        double[] celsius = new double[fahrenheit.length];
        for(int i = 0; i < celsius.length; i++){
            celsius[i] = (fahrenheit[i] * 5 / 9) - 32;
        }
        return celsius;
    }
          

    public static void printTemperatures(double[] temp, String tempType){
        
        System.out.println(tempType + ":");
        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i] + " ");
        }
        System.out.println("\n");
    }
}