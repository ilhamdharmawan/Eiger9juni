/**
 * Created by Win7 on 6/9/2015.
 */
public class Eiger {

    //Attribut
    private String namaSepatu;
    private double hargaSepatu;
    private int jumlahStok;
    private Knife pisau;

    public Eiger(String namaSepatu, double hargaSepatu, int jumlahStok, Knife pisau) {
        this.namaSepatu = namaSepatu;
        this.hargaSepatu = hargaSepatu;
        this.jumlahStok = jumlahStok;
        this.pisau = pisau;
    }

    public Eiger(double hargaSepatu, String namaSepatu, Knife pisau) {
        this.hargaSepatu = hargaSepatu;
        this.namaSepatu = namaSepatu;
        this.pisau = pisau;
    }

    public String getNamaSepatu() {
        return namaSepatu;
    }

    public void setNamaSepatu(String namaSepatu) {
        this.namaSepatu = namaSepatu;
    }

    public double getHargaSepatu() {
        return hargaSepatu;
    }

    public void setHargaSepatu(double hargaSepatu) {
        this.hargaSepatu = hargaSepatu;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public Knife getPisau() {
        return pisau;
    }

    public void setPisau(Knife pisau) {
        this.pisau = pisau;
    }

    @Override
    public String toString() {
        return "Eiger{" +
                "namaSepatu='" + namaSepatu + '\'' +
                ", hargaSepatu=" + hargaSepatu +
                ", jumlahStok=" + jumlahStok +
                ", pisau=" + pisau +
                '}';
    }
}

