package com.rplbo.utsnota;

public class kalkulator {
    private int bil2, bil1;
    private String op;

    public kalkulator(BilanganString string1, BilanganString string2, Operator operator){
        this.bil1 = string1.getBilangan();
        this.bil2 = string2.getBilangan();
        this.op = operator.getOperatorSimbol();
    }

    public void hitung(){
        if (this.op.equals("+")){
            double total = bil1 + bil2;
            System.out.println("hasil : "+total);
        } else if (this.op.equals("-")){
            double total = bil1 - bil2;
            System.out.println("hasil : "+total);
        } else if (this.op.equals("*")){
            double total = bil1 * bil2;
            System.out.println("hasil : "+total);
        } else if (this.op.equals("/")){
            double total = bil1 / bil2;
            System.out.println("hasil : "+total);
        } else if (this.op.equals("^")){
            double total = 1;
            while (bil2 != 0){
                total *= bil1;
                --bil2;
            }
            System.out.println("hasil : "+total);
        }
    }
}
