package bigame.com.tr.mobilazel3;

/**
 * Created by burakisik on 7/14/2017.
 */

public class Fatura {

    private int birimFiyat;
    private int tutar;
    private int miktar;
    private String aciklama;

    private  String faturaDonemi;
    private int faturaId=0;

    public int getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(int birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public int getFaturaId() {
        return faturaId;
    }

    public void setFaturaId(int faturaId) {
        this.faturaId = faturaId;
    }


    public String getFaturaDonemi() {
        return faturaDonemi;
    }

    public void setFaturaDonemi(String faturaDonemi) {
        this.faturaDonemi = faturaDonemi;
    }
}
