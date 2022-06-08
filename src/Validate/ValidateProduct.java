package Validate;

import modal.Product;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateProduct {
     Scanner sc = new Scanner(System.in);
    public int checkCodeProductExist(ArrayList<Product> products,String codeProduct){
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProductCode().equals(codeProduct)){
                return i;
            }
        }
        return -1;
    }
    public String checkCodeProduct(ArrayList<Product> products){
        final  String codeStrRegex = "[0-9]{6}";
        System.out.println("Enter code product :");
        String codeProduct = sc.nextLine();
        Pattern p = Pattern.compile(codeStrRegex);
        Matcher m = p.matcher(codeProduct.trim());
        if(m.matches()){
            if(checkCodeProductExist(products,codeProduct)<0){
                return codeProduct;
            }
            else {
                System.out.println("Product code already exists, please re-enter!");
                return checkCodeProduct(products);
            }
        }
        else {
            System.out.println("Product code requires 6 numeric characters, please re-enter!");
            return checkCodeProduct(products);
        }
    }
    public String checkNameProduct(ArrayList<Product> products){
        System.out.println("Enter name product :");
        String nameProduct = sc.nextLine();
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProductName().equals(nameProduct)){
                System.out.println("Name product already exists, please re-enter!");
                return checkNameProduct(products);
            }
        }
        return nameProduct;
    }
    public double checkPriceProduct(){
       try {
           System.out.println("Enter price product:");
           double priceProduct = Double.parseDouble(sc.nextLine());
           if(priceProduct>0){
               return priceProduct;
           }
           throw  new Exception();
       }
        catch (NumberFormatException e){
            System.out.println(" Import bad format !");
            return checkPriceProduct();
        }
       catch (Exception e){
           System.out.println("Price product invalid");
           return checkPriceProduct();
       }
    }
    public  int checkQuantityProduct(){
        try {
            System.out.println("Enter quantity product:");
            int quantityProduct = Integer.parseInt(sc.nextLine());
            if(quantityProduct>0){
                return quantityProduct;
            }
            throw  new Exception();
        }
        catch (NumberFormatException e){
            System.out.println(" Import bad format !");
            return checkQuantityProduct();
        }
        catch (Exception e){
            System.out.println("Price product invalid");
            return checkQuantityProduct();
        }
    }
}
