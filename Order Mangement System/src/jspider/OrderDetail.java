package jspider;

public class OrderDetail {
	private Order[] orr;
	private int index=0;
	private int orderCount=0;
	
	OrderDetail(int size){
		orr=new Order[size];
	}
	/**
	 * this method is used to add Employee details into the Database.
	 * @param o should be Order type
	 * @return Returns true if added successfully, else return false
	 */
	 boolean addOrder(Order o) {
		if(index<orr.length) {
			orr[index++]=o;
			System.out.println("Order deatils added to DB");
			orderCount++;
			return true;
		}
		else {
			System.out.println("Database is full");
			return false;
		}
	}
	 /**
	  * this method prints all the details of the product
	  */
	public void viewFullDatabase() {
		System.out.println("--------------------------------------------------");
		System.out.println("ID\tName\tprice\tno\tquantity\tbrand");
		System.out.println("--------------------------------------------------");
		for (Order ord : orr) {
			if (ord != null) {
				System.out.println(ord.getOdid() + "\t" + ord.getOdname() + "\t" + ord.getPrice() + "\t" + ord.getOdno()
						+ "\t" + ord.getQuantity() + "\t" + ord.getBrand());
			}
		}
	}
	/**
	 * this method used to get total order in Database
	 * @return int value representing total product
	 */
	public int getOrderCount(){
		return orderCount;
	}
	/**
	 * this method is used to search product based on id,
	 * @param id of the product to be searched
	 * @return return reference to found product otherwise return null
	 */
		public Order searchProduct(int id) {
		Order o=null;
		for(int i=0;i<orr.length;i++) {
			if(orr[i]!=null&&orr[i].getOdid()==id) {
				System.out.println("Product found in database");
				o=orr[i];
			}
		}
		if(o==null) {
			System.out.println("Product is not found in database");
		}
		return o;
	}
		/**
		 * this method is used to update the number of product. if product is found in
		 * database it will update number of the product by the specified amount
		 * @param id of the product to be deleted
		 * @param number to be added to order
		 * @return true-update is success
	     *         false- update is failed
		 */
		public boolean updateProduct(int id,double number) {
		Order o=searchProduct(id);
		if(o!=null) {
			o.setOdname(o.getOdname()+number);
			System.out.println("product Updated");
			return true;
		}
		else {
			System.out.println("unable to update");
			return false;
		}
	}
		/**
		 * this method is used to delete product details from database.
	     * it deletes the complete product details if the records found in database.
		 * @param id of the product to be deleted
		 * @return true-if product is success
         *         false- if product is failed
		 */
		public boolean deleteProduct(int id) {
		boolean isDelete=false;
		for(int i=0;i<orr.length;i++) {
			if(orr[i]!=null && orr[i].getOdid()==id) {
				System.out.println("product found in database and deleted");
				orr[i]=null;
				isDelete=true;
				orderCount--;
			
			}
		}
		if(isDelete==false) {
			System.out.println("product not found in database");
		}
		return isDelete;
	}
}

