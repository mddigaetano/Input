package datastreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Amedeo Di Gaetano <digaetano.amedeo@gmail.com>
 */
public class Input {
    
    public static String readString() {
        String ret = null;
        
        try{
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            ret = keyboard.readLine();
            
        } catch (IOException ex) {
            System.err.println("Errore nella lettura da tastiera");
        }
        
        return ret;
    }
    
    public static int readInt(){
        int ret = 0;
        
        try{
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            ret = Integer.parseInt(keyboard.readLine());
            
        } catch (NumberFormatException nfe){
            System.err.println("Errore nel formato del numero");
        } catch (IOException ex) {
            System.err.println("Errore nella lettura da tastiera");
        }
        
        return ret;
    }
    
    public static float readFloat(){
        float ret = 0;
        
        try{
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            ret = Float.parseFloat(keyboard.readLine());
            
        } catch (NumberFormatException nfe){
            System.err.println("Errore nel formato del numero");
        } catch (IOException ex) {
            System.err.println("Errore nella lettura da tastiera");
        }
        
        return ret;
    }
    
    public static double readDouble(){
        double ret = 0;
        
        try{
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            ret = Double.parseDouble(keyboard.readLine());
            
        } catch (NumberFormatException nfe){
            System.err.println("Errore nel formato del numero");
        } catch (IOException ex) {
            System.err.println("Errore nella lettura da tastiera");
        }
        
        return ret;
    }
}
