package Gitproject0;

public class GoodI{
        public static void main(String[] args){
        int x=2, n=9; int value =1;
        while(n>0){
             if(n%2==1)
             value = value*x;
             x=x*x;
             n = n/2;

          }

        System.out.println(value);
        }
        }
