/**
 * Created by Win7 on 6/9/2015.
 */
public class TestEiger {
    public static void main(String[] args) {


        Knife pen = new Knife("Trust", "Lipat", 'E');
        System.out.println("nama pisau  :" + pen.getNamaPisau());
        System.out.println("model pisau :" + pen.getModelPisau());
        System.out.println("kode pisau  :" + pen.getKodePisau());

        Eiger shoes = new Eiger("Trow", 600.000, 5, pen);
        System.out.println("Semua data  :" + shoes.toString());
        System.out.println("Nama sepatu :" + shoes.getNamaSepatu());
        System.out.println("Harga sepatu:" + shoes.getHargaSepatu());
        System.out.println("Jumlah stok :" + shoes.getJumlahStok());
        System.out.println("Bonus       :" + shoes.getPisau());
    }
}