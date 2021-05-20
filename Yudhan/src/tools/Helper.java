/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import static java.lang.System.out;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class Helper {
    public static Integer pilih;
    public static String inputMakan,inputMinum,input;
    public static Stack<String> makanStack = new Stack<>();
    public static Stack<String> minumStack = new Stack<>();
    public static Queue<String> makanQueue = new LinkedList<>();;
    public static Queue<String> minumQueue = new LinkedList<>();;
    public static Scanner sc = new Scanner(System.in);
    
    public static void print(String p){
        out.print(p);
    }
    public static void println(String p){
        out.println(p);
    }
}
