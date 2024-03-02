package TUT3;
import java.util.Scanner;
public class Product {
    private String name;
    private double price;
    private double discount;

    Scanner sc = new Scanner(System.in);


    public Product() {

    }

    public Product (String name) {
        this.name = name ;
    }

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product (String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }


    public String getName () {
        return this.name;
    }
    public double getPrice () {
        return this.price;
    }

    public double getDiscount () {
        return this.discount;
    }




    public void setName (String name) throws Exception {

        if(isValidateName(name)) {
            this.name = name;
        }
        else{
            throw new Exception("Invalid name:" + name);
        }
    }
    public void setPrice (double price) throws Exception {
        if(isValidatePrice(price)) {
            this.price = price;
        }
        else{
            throw new Exception("Invalid price:" + price);
        }
    }
    public void setDiscount (double discount) throws Exception {
        if(isValidateDiscount(discount)) {
            this.discount = discount;
        }
        else{
            throw new Exception("Invalid discount:" + discount);
        }
    }
    public void setProductDetail (String name,double price,double discount) {

    }
    private double calculateImportTax () {
        return this.price*0.1;
    }
    public void displayDetails () {
        System.out.println("The product " + name + " have price: " + price + " ,discount: "+ discount + " and texes: " + calculateImportTax());
    }

    public void promtDetail () throws Exception {
        promtName();
        promtPrice();
        promtDiscount();
    }
    public void promtName () {
        String name = "";
        do {
            System.out.print("Enter product name: ");
             name = sc.nextLine();
            if (!isValidateName(name)) {
                this.name = name;
            }else{
                System.out.println("Invalid name. Please re-enter product name: ");
            }

        }while (isValidateName(name));
    }
    public void promtPrice () throws Exception {
        double price = 0;
        do {
            System.out.print("Enter product price: ");
            try{
                 price = sc.nextDouble();
            }catch (Exception e) {
                System.out.println("Invalid price!");
                System.out.println("please re-enter product price: ");
                promtPrice();
            }
            if (isValidatePrice(price)) {
                this.price = price;
            }
            else{
                System.out.println("Invalid price!");
                System.out.println("please re-enter product price: ");
            }

        }while (!isValidatePrice(price));
    }
    public void promtDiscount () throws Exception {
        do {
            System.out.print("Enter product discount: ");
            double discount = 0;
            try{
                 discount = sc.nextDouble();
            }catch (Exception e) {
                System.out.println("Invalid discount!");
                System.out.println("please re-enter product discount: ");
                promtDiscount();
            }
            if (isValidateDiscount(discount)) {
                this.discount = discount;
            }
            else{
                System.out.println("Invalid discount!");
                System.out.println("please re-enter product discount: ");
            }

        }while (!isValidateDiscount(discount));
    }

    public boolean isValidateName (String name) {
        return name.matches(".*\\d.*");
    }
    public boolean isValidatePrice (double price)  {
        if(price > 0) {
            this.price = price;
            return true;
        }
        else{
            return false;

        }
    }
    public boolean isValidateDiscount (double discount) throws Exception {
        if(discount > 0) {
            this.discount = discount;
            return true;
        }
        else{
            return false;

        }
    }


}
