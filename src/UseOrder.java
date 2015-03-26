import java.text.DecimalFormat;
import java.util.Date;

/*UseOrder.java by Kyle Wolff and Brandon VanderMey March 26th 2015*/


public class UseOrder {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("$#,###.00");
		
		Date date = new Date();
		System.out.println("Orders by Kyle Wolff and Brandon VanderMey on " + date);
		
		String name = null;
		int custNum = 0;
		int quantityOrdered = 0;
		float unitPrice = 0.0f;
		float totalPrice = 0.0f;
		float totalPrice2 = 0.0f;

		
		Order order = new Order();
		order.setcustomerName(name);
		order.setcustomerNumber(custNum);
		order.setquantityOrdered(quantityOrdered);
		order.setunitPrice(unitPrice);
		
		totalPrice = order.computePrice();
		
		
		System.out.println("\nYour receipt: ");
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\n| Name: " + order.getcustomerName() + "|");
		stringBuilder.append("\n| Cust Number: " + order.getcustomerNumber() + "|");
		stringBuilder.append("\n| Quantity: " + order.getquantityOrdered() + "|");
		stringBuilder.append("\n| Price: " +  df.format(order.getunitPrice()) + "|");
		stringBuilder.append("\n| Total Price: " + df.format(totalPrice) + "\n\n");
		System.out.print(stringBuilder);
		
		
		ShippingOrder shippingOrder = new ShippingOrder();
		shippingOrder.setcustomerName(name);
		shippingOrder.setcustomerNumber(custNum);
		shippingOrder.setquantityOrdered(quantityOrdered);
		shippingOrder.setunitPrice(unitPrice);
		
		totalPrice2 = shippingOrder.computePrice();
		
		System.out.println("\n\n\nYour receipt: ");
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append("\n| Name: " + shippingOrder.getcustomerName() + "|");
		stringBuilder2.append("\n| Cust Number: " + shippingOrder.getcustomerNumber() + "|");
		stringBuilder2.append("\n| Quantity: " + shippingOrder.getquantityOrdered() + "|");
		stringBuilder2.append("\n| Price: " + df.format(shippingOrder.getunitPrice()) + "|");
		stringBuilder2.append("\n| Total Price: " + df.format(totalPrice2));
		System.out.print(stringBuilder2);
		
		//END

	}

}