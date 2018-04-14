package com.bisoft.mobilazel;

import java.util.ArrayList;

/**
 * Created by burakisik on 7/14/2017.
 */

class Service  {
    public ArrayList<BillModel> billList =new ArrayList<BillModel>();

    public ArrayList<BillModel> getFaturalar(int userId){

        for(int i =1; i<12;i++){
            BillModel bill = new BillModel();
            bill.setQuantity(120*i);
            bill.setDeclaration("isinma(kwh)");
            bill.setDebt(50*i);
            bill.setUnitPrice(45*i);
            bill.setPayingBillPeriod("05."+(i)+".2016");//"dd.MM.yyyy"
            bill.setBillId(i);

            billList.add(bill);
        }
        return  billList;
    }

    public int Login(String username,String userpass){
        return 1;
    }
    
}
