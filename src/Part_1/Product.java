package Part_1;

public class Product {
	int productID;
	int quantitySold;
	double price;

	
	
	public Product(int productID, int quantitySold) 
	{
		super();
		setProductID(productID);
		this.quantitySold = quantitySold;
	}
	
	public double calcTotal()
	{
		{
			return (price * quantitySold);
		}
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) 
	{
		this.productID = productID;
				switch(productID)
				{
				case 1: price = 2.98;
						break;
				case 2: price = 4.50;
						break;
				case 3: price = 9.98;
						break;
				case 4: price = 4.49;
						break;
				case 5: price = 6.87;
						break;
				}
	}

	public double getPrice() {
		return price;
	}

	public int getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
}

