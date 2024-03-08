/*
 * actually has two type of methods to take input from user
 * first one was BufferedReader 
 * it will be used like [Syntax]
 * BufferedReader br = new Bufferedreader(new InputStreamReader(System.in))
 * System.in --> supplies the bits [0 && 1] it will be tranformed into characters by InputStreamReader
 * and the characters converted into strings by BufferedReader and stored in the variable br. 
 * 
 * new -> represents the new object creation. [[will see ya in oops]].
 */

import java.io.*;

public class inputs {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Tell me your Name ?");
        String data = br.readLine();
        System.out.println("Your Name is "+ data);
    }

    
}// the BufferedReader files are in java.io header.




