/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package himcm_2018;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yunsongliu
 */
public class Coaster {

    enum type {
        Name, Park, CityRegion, CityStateRegion, CountryRegion,
        GeographicRegion, Construction, Type, Status
    };
    String[] stringinfo = new String[9];
    int YearDateOpened = -1;
    double Height = -1;
    double Speed = -1;
    double Length = -1;
    String Inversions = "";
    int NumberOfInversions = -1;
    double Drop = -1;
    String Duration = "";
    double GForce = 0;
    double VerticalAngle = 0; 

    public Coaster(Scanner scan) {
        for (int i = 0; i < 9; i++) {
            stringinfo[i] = scan.next();
        }
        try{
            YearDateOpened = scan.nextInt();
        } catch (InputMismatchException e) {
            YearDateOpened = -1;
        }
        try {
        Height = scan.nextDouble();
        } catch (InputMismatchException e) {
            Height = Double.NaN;
        }
        try {
            Speed = scan.nextDouble();
        } catch (InputMismatchException e) {
            Speed = Double.NaN;
        }
        try {
            Length = scan.nextDouble();
        } catch (InputMismatchException e) {
            Length = Double.NaN;
        }
        Inversions = scan.next();
        try {
        NumberOfInversions = scan.nextInt();
        } catch (InputMismatchException e) {
            NumberOfInversions = -1;
        }
        try {
            Drop = scan.nextDouble();
        } catch (InputMismatchException e) {
            Drop = Double.NaN;
        }
        Duration = scan.next();
        try {
            GForce = scan.nextDouble();
        } catch (InputMismatchException e) {
            GForce = Double.NaN;
        }
        try {
            VerticalAngle = scan.nextDouble();
        } catch (InputMismatchException e) {
            VerticalAngle = Double.NaN;
        }
        for (int i = 0; i < 9; i++){
            System.out.print(stringinfo[i] + ", ");
        }
        System.out.println(Height + ", " + Speed + ", " + Length + ", ");
    }
}
