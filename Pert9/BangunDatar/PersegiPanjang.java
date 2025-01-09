package Pert9.BangunDatar;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}