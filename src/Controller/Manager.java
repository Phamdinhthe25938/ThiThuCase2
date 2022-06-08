package Controller;

import Validate.ValidateProduct;
import modal.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    Scanner sc = new Scanner(System.in);
    ValidateProduct validateProduct= new ValidateProduct();
    ArrayList<Product> productList= new ArrayList<>();
    public Product creatProduct(){
        String codeProduct = validateProduct.checkCodeProduct(productList);

        String nameProduct = validateProduct.checkNameProduct(productList);

        double priceProduct = validateProduct.checkPriceProduct();

        int quantityProduct = validateProduct.checkQuantityProduct();

        System.out.println("Enter the description of the product :");

        String descriptionProduct = sc.nextLine();

        return new Product(codeProduct,nameProduct,priceProduct,quantityProduct,descriptionProduct);
    }
    public void addProduct(){
        productList.add(creatProduct());
    }
    public void editProduct(){
        System.out.println("Enter code product you want edit :");
        String codeProductEdit = sc.nextLine();
        if(validateProduct.checkCodeProductExist(productList,codeProductEdit)>=0){
            int vtCodeProductEdit = validateProduct.checkCodeProductExist(productList,codeProductEdit);
            productList.set(vtCodeProductEdit,creatProduct());
        }
    }
    public void deleteProduct(){
        System.out.println("Enter code product you want delete :");
        String codeProductDelete = sc.nextLine();
        if(validateProduct.checkCodeProductExist(productList,codeProductDelete)>=0){
            int vtCodeProductDelete = validateProduct.checkCodeProductExist(productList,codeProductDelete);
            productList.remove(vtCodeProductDelete);
        }
    }
}
