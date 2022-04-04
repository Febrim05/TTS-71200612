package com.rplbo.utstokosedia;

public class Invoice {
    private int jumlah;
    private long tagihan;
    private Produk produk;
    private Member member;

    public invoice{

    }
    public void printinvoice(){
        System.out.println();
    }
    public long getTagihan(){
        return this.tagihan;
    }
    public void buatInvoice(Produk produk, int jumlah, Member member){
        System.out.println("");
    }
}
