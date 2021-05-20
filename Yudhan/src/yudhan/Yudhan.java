/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yudhan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import menu.QueueMenu;
import menu.StackMenu;
import static java.lang.System.out;
import tools.Helper;


/**
 *
 * @author ASUS
 */
public class Yudhan extends Helper{

    /**
     * my name is yudhan :)
     */
    public static void main(String[] args) {
    menu();
    }
    public static void menu(){
        println("1. Menu Stack \n2. Menu Queue");
       print("Pilih : ");
       pilih = sc.nextInt();
       switch(pilih){
           case 1:
           StackMenu sm = new StackMenu();
           sm.menuStack();
           case 2: 
           QueueMenu qm = new QueueMenu();
           qm.menuQueue();
       }
       
    }
    
}
