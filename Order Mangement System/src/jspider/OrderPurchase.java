package jspider;

public class OrderPurchase {
private static int randmnum=1;
	
	public Order purchaseOrder(String odname,double price,int odno,int quantity,String brand) {
	Order or= new Order(randmnum++, odname, price, odno, quantity,brand);
	return or;
		}

}
