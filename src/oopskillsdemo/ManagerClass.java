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
public class ManagerClass {
    private String first;
    private String last;
    private String ppsn;
    private double years;
    private double salary;
    private double total;

    /**
     * @return the first
     */
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
     * @param last the last to set
     */
    public void setLast(String last) {
        if(last.matches("[a-zA-Z]+")){
            this.last = last ;
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

    /**
     * @param ppsn the ppsn to set
     */
    public void setPpsn(String ppsn) {
        if(ppsn.matches("[A-Za-z0-9]+")){
            this.ppsn = ppsn ;
        }
        else{
            this.ppsn = "Error";
        }
    }

    /**
     * @return the years
     */
    public double getYears() {
        return years;
    }

    /**
     * @param years the years to set
     */
    public void setYears(double years) {
        this.years = years;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
}
