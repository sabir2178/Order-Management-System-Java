package jspider;

public class OrderApp {
	public static void main(String[] args) {
		System.out.println("----------------------------");

		OrderPurchase op = new OrderPurchase();
		Order o1 = op.purchaseOrder("shirt", 400.50, 3, 1, "HRX");
		Order o2 = op.purchaseOrder("tshirt", 600.00, 3, 1, "zara");
		Order o3 = op.purchaseOrder("jean", 1000.00, 3, 1, "zara");
		Order o4 = op.purchaseOrder("volleyball", 6000.00, 3, 1, "zara");

		OrderDetail od = new OrderDetail(10);

		od.addOrder(o1);
		od.addOrder(o2);
		od.addOrder(o3);

		od.viewFullDatabase();
		System.out.println("Total Employee: " + od.getOrderCount());

		od.viewFullDatabase();

		System.out.println();
		Order o = od.searchProduct(2);
		System.out.println(o.getOdid() + " " + o.getOdname());
		od.updateProduct(3, 5000.00);
		od.viewFullDatabase();
		od.deleteProduct(1);
		od.viewFullDatabase();
		System.out.println("Total Employee: " + od.getOrderCount());

		System.out.println("----------------------------");
	}
}

