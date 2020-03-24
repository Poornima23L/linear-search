package com.tgt.ignite.plus;

import java.util.Scanner;

public class lin_sea {
    public static void main(String[] args ){
        int[] a1={1,8,9,56,90,11,58,96,6};
        int key,i;
        Scanner read = new Scanner(System.in);
        System.out.println("enter number to be searched");
        key = read.nextInt();
        int p=a1.length;
        for( i=0;i<p;i++){
            if(a1[i]==key){
                System.out.println(key+ "is found at index:" +i);
                break;
            }
            else if (i==(p-1)){
                System.out.println("element not found");
            }
        }



    }
}
