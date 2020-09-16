package main_p;

public class Products {
	private String prod;
    private int price;
    
    public Products(){
    	prod="";
    	price=0;
    }
    
    public void setProd(String prod) {
    	this.prod=prod;
    }
    
    public void setPrice(int price) {
    	this.price=price;
    }
    
    public String getProd() {
    	return this.prod;
    }
    
    public int getPrice() {
    	return this.price;
    }
}
