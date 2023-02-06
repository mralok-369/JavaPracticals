package com.company.classWork;
import java.util.Random;

class CustomCoin {
    private int head=0;
    private int tail=0;
    public int flip() {
        Random random = new Random();
        for(int i=0; i<500; i++)
        {
            if(random.nextInt(2)==1)
                tail++;
            else
                head++;
        }
        System.out.printf("Head = %d\nTail = %d\n",head,tail);
        if(head==tail)
            return 1;
        else
            return 0;
    }
}
public class que12 {
    public static void main(String[] args) {
        CustomCoin cn = new CustomCoin();
        if(cn.flip()==1)
            System.out.println("coin is unbiased");
        else
            System.out.println("coin is biased");
    }
}
