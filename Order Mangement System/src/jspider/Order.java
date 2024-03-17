package jspider;

public class Order {
		private final int odid;
		private String odname;
		private double price;
		private int odno;
		private int quantity;
		private String brand;
		public Order(int odid, String odname, double price, int odno, int quantity, String brand) {
			this.odid = odid;
			this.odname = odname;
			this.price = price;
			this.odno = odno;
			this.quantity = quantity;
			this.brand = brand;
		}
		public String getOdname() {
			return odname;
		}
		public void setOdname(String odname) {
			this.odname = odname;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getOdno() {
			return odno;
		}
		public void setOdno(int odno) {
			this.odno = odno;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getOdid() {
			return odid;
		}
				
	}

