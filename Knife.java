/**
 * Created by Win7 on 6/9/2015.
 */
public class Knife {

    private String namaPisau;
    private String modelPisau;
    private char kodePisau;

    public Knife(String namaPisau, String modelPisau, char kodePisau) {
        this.namaPisau = namaPisau;
        this.modelPisau = modelPisau;
        this.kodePisau = kodePisau;
    }

    public String getNamaPisau() {
        return namaPisau;
    }

    public void setNamaPisau(String namaPisau) {
        this.namaPisau = namaPisau;
    }

    public String getModelPisau() {
        return modelPisau;
    }

    public void setModelPisau(String modelPisau) {
        this.modelPisau = modelPisau;
    }

    public char getKodePisau() {
        return kodePisau;
    }

    public void setKodePisau(char kodePisau) {
        this.kodePisau = kodePisau;
    }

    @Override
    public String toString() {
        return "Knife{" +
                "namaPisau='" + namaPisau + '\'' +
                ", modelPisau='" + modelPisau + '\'' +
                ", kodePisau=" + kodePisau +
                '}';
    }
}


