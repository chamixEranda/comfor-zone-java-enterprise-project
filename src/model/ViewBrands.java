/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Chamith
 */
public class ViewBrands {
    public String BrandID;
    public String Brandname;
    public String Size;
    public String Colour;
    public String Price;
    
    public ViewBrands(String BrandID,String Brandname,String Size,String Colour,String Price){
        this.BrandID = BrandID;
        this.Brandname = Brandname;
        this.Size = Size;
        this.Colour = Colour;
        this.Price = Price;
    }
}
