/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package himcm_2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yunsongliu
 */
public class HiMCM_2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("COMAP_RollerCoasterData_2018.csv")).useDelimiter(",\r\n|,");
        String[] parameters = new String[19];
        for(int i = 0; i < 19; i++){
            parameters[i] = scan.next();
            System.out.println(parameters[i] + " ");
        }
        System.out.println();
//        for(int i = 0; i < 4; i++)
//            System.out.println(scan.next());
        
        Coaster[] test = new Coaster[300];
        for(int i = 0; i < 300; i++){
//            try{
                test[i] = new Coaster(scan);
//            } catch (InputMismatchException e){
//                System.out.println(i);
//                System.exit(1);
//            }
        }
        
    }
    
}
