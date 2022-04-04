package com.rplbo.utsnota;

public class Operator{
    String operatorString;
    String operatorSimbol;

    public Operator(String kata) {
        double result;
        String help = kata.toLowerCase();
        if (help.equals("tambah")){
            this.operatorSimbol = "+";
        } else if (help.equals("kurang")){
            this.operatorSimbol = "-";
        } else if (help.equals("bagi")){
            this.operatorSimbol = "/";
        } else if (help.equals("kali")){
            this.operatorSimbol = "*";
        } else if (help.equals("pangkat")){
            this.operatorSimbol = "^";
        }
    }

    public String getOperatorSimbol() {
        return operatorSimbol;
    }
}
