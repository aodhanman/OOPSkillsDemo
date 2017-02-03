/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopskillsdemo;

/**
 *
 * @author aodhan
 */
public class SalespersonClass {
    private String first ;
    private String last  ;
    private String ppsn  ;
    private double sales ;
    private double hours ; 
    
    
    
    public String getFirst() {
        return first;
    }
   
        
    public void setFirst(String value) {
        if(value.matches("[a-zA-Z]+")){
            this.first = value ;
        }
        else{
            this.first = "Error";
        }
   
    }

    /**
     * @return the last
     */
 
    public String getLast() {
        return last;
    }

    /**
     * @param last
     */
    public void setLast(String value) {
        if(value.matches("[a-zA-Z]+")){
            this.last = value ;
        }
        else{
            this.last = "Error";
        }
                
    }

    /**
     * @return the ppsn
     */
    public String getPpsn() {
        return ppsn;
    }

   
    public void setPpsn(String value) { 
        if(value.matches("[A-Za-z0-9]+")){
            this.ppsn = value ;
        }
        else{
            this.ppsn = "Error";
        }

    }

    /**
     * @return the sales
     */
    public double getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(double value) {
       
        this.sales = value;
       
    }

    /**
     * @return the hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(double value) {
        this.hours = value;
    }
}
