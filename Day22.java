package informatic_study_club;

public class Day22 {
    public static void main(String[] args) {
        
    }
    double panjang;
    double lebar;
    double keliling;
    double luas;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getKeliling() {
        keliling = panjang * 2 + lebar * 2;
        return panjang;
    }

    public double getLuas() {
        luas = panjang * lebar;
        return luas;
    }

}
