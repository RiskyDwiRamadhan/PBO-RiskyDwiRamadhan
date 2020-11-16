/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percobaan;

/**
 *
 * @author User
 */
public class ElectricityBill implements Payable{
    private int kwh;
    private String category;

    public ElectricityBill(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }
    
    public int getKwh(){
        return kwh;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setKwh(int kwh){
        this.kwh = kwh;
    }
    
    public void setCategory(String category){
        this.category = category;
    }            
            
    public int getBasePrice(){
        int brPrice = 0;
        switch(category){
            case "R-1" : brPrice=100;break;
            case "R-2" : brPrice=200;break;
        }
        return brPrice;
    }
    
    @Override
    public int getPaymentAmount() {
        return kwh*getBasePrice();
    }
    
    public String getBillInfo(){
        return "KWH = "+kwh+"\n"+
                "Category = "+category+"("+getBasePrice()+" per kwh)\n";
    }
}
