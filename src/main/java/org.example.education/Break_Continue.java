package org.example.education;

public class Break_Continue {
    public static void main(String[] args) {
      for(int i = 0;i<=15; i++){
          if(i%2==0){
              continue;
          }
          System.out.println("Это нечетное число"+i);
      }
    }
}
