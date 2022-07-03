/*
 * Class: CMSC203 CNR 46622 
 * Instructor: Prof.Grigoriy A. Grinberg
 * Description: (This program generate random numbers between 0 and 100.)
 * Due: 07/03/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ABAYNEH MENGISTU
*/

import java.util.Random;

public class RNG
{
    Random number = new Random();

    public int getX()
    {
        int x = number.nextInt(100); 
        return x;
    }
  }