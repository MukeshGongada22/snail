package com.epam.rd.autotasks.snail;
import java.util.*;
public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b= s.nextInt();
        int h = s.nextInt();
        int l=0,count=0;
        if(a>b  && b!=0){
            while(l<h){
                l=l+a;
                if(l<=h){
                    count++;
                    if(l==h){
                        break;
                    }
                }

                l=l-b;


            }
            System.out.println(count);
        }
        else if(a==b && h!=1){
            if(a<h) {
                System.out.println("Impossible");
            }
            else{
                System.out.println("1");
            }
        }

        else if(a<b || ((a+b)>h)){
            if(a<h){
                System.out.println("Impossible");
            }
            else {
                System.out.println("1");
            }
        }

    }
}
