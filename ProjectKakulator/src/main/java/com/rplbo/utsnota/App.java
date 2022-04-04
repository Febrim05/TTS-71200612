package com.rplbo.utsnota;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        BilanganString b1 = new BilanganString("DuA BelaS");
        BilanganString b2 = new BilanganString("tiga BELAS");
        System.out.println("Apakah 2 digit? " + b1.apakahDuaDigit());
        System.out.println("Apakah lebih dari 10? " + b2.apakahLebihDari10());
        Operator op = new Operator("TaMbah");
        kalkulator k = new kalkulator(b1,b2,op);
        k.hitung();
        kalkulator k2 = new kalkulator(new BilanganString("dua"),new
                BilanganString("tiga"),new Operator("pangkat"));
        k2.hitung();
    }

}
