package DesignPattern11.StaticFactoryMethod;

/**
 * @author TianYe
 * @create 2018-08-04 10:47
 */
public class ProductFactory {
    public static Product createProduct(String productType){
        Product product = null;

        if(productType.equals("A")){
            product = new ProductA();
        }else if(productType.equals("B")){
            product = new ProductB();
        }else{
            System.out.println("No such type!!!");
        }

        return product;
    }
}
