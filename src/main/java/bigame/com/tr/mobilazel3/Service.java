package bigame.com.tr.mobilazel3;

import java.util.ArrayList;

/**
 * Created by burakisik on 7/14/2017.
 */

class Service  {
    public ArrayList<Fatura> faturalar=new ArrayList<Fatura>();

    public Service()
    {
    }

    public ArrayList<Fatura> getFaturalar( int userId){

        for(int i =0; i<3;i++){
            Fatura fatura = new Fatura();
            fatura.setTutar(120);
            fatura.setAciklama("isinma(kwh)");
            fatura.setMiktar(50);
            fatura.setBirimFiyat(45);
            fatura.setFaturaDonemi("05."+(i+1)+".2016");//"dd.MM.yyyy"
            fatura.setFaturaId(i);

            /*
            fatura.faturaTurleri.setBirimFiyat(1000);
            fatura.faturaTurleri.setMiktar(50);
            fatura.faturaTurleri.setTutar(250);
           */
            faturalar.add(fatura);
        }
        return  faturalar;
    }

    public int Login(String username,String userpass){
        return 1;
    }


}
