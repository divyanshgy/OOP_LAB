/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8q1;

interface computer{
    double totalSales();
}

class hardware implements computer{
    String cat;
    String manufac;
    double price;
    double qty;
    double months;
    hardware(String cat,String manufac,double price,double qty,double months){
        this.cat=cat;
        this.manufac=manufac;
        this.price=price;
        this.qty=qty;
        this.months=months;
    }
    public double totalSales(){
        return price*qty;
    }
}

class software implements computer{
    String soft;
    String os;
    double price;
    double qty;
    double months;
    software(String soft,String os,double price,double qty,double months){
        this.soft=soft;
        this.os=os;
        this.price=price;
        this.qty=qty;
        this.months=months;
    }
    public double totalSales(){
        return price*qty;
    }
}

public class Lab8q1 {

    public static void main(String[] args) {
        hardware hardwareItem = new hardware("Electronics", "Manufacturer A",1000.0, 50, 3);
        software softwareItem = new software("Security", "Windows",50.0, 100, 3);

        double totalHardwareSales = hardwareItem.totalSales();
        double totalSoftwareSales = softwareItem.totalSales();

        System.out.println("Total Hardware Sales for the Last 3 Months: $" + totalHardwareSales);
        System.out.println("Total Software Sales for the Last 3 Months: $" + totalSoftwareSales);
    }
    
}
