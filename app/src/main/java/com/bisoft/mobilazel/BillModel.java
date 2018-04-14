package com.bisoft.mobilazel;
/**
 * Created by burakisik on 7/14/2017.
 */
public class BillModel{
    private int unitPrice;
    private int debt;
    private int quantity;
    private String declaration;
    private  String payingBillPeriod;
    private int billId=0;

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int tutar) {
        this.debt = tutar;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getPayingBillPeriod() {
        return payingBillPeriod;
    }

    public void setPayingBillPeriod(String payingBillPeriod) {
        this.payingBillPeriod = payingBillPeriod;
    }
}