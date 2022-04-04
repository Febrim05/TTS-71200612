package com.uts.prakrplbo;

import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    private List<Buah> daftarBuah = new ArrayList<>();

    public void tambahProduk(Buah buah){
        daftarBuah.add(buah);
        System.out.println(buah +"berhasil ditambahkan ke dalam keranjang!");
    }
    public void hapusProduk(Buah buah){
        daftarBuah.remove(buah);
        System.out.println(buah + "berhasil dikeluarkan dari dalam keranjang!");
    }
    public void getKeranjang(){
        for (int index=0; index< daftarBuah.size(); index++){
            System.out.println(daftarBuah.get(index));
        }
    }
}
