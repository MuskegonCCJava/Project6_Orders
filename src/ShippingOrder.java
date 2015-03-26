public class ShippingOrder extends Order {
	
	float shippingAndhandling = 4.0f;

	public ShippingOrder() {
		
	}
	

	@Override
	public float computePrice() {
		
		totalPrice = shippingAndhandling +  (unitPrice * quantityOrdered);
		
		return totalPrice;
	}

}