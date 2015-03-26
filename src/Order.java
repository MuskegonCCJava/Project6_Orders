import java.util.Scanner;


public class Order {
	
	String customerName;
	int customerNumber;
	int quantityOrdered;
	float unitPrice;
	float totalPrice;
	
	Scanner keyboard = new Scanner(System.in);
	
	
	public String getcustomerName(){
		
		return customerName;
	}
	
	public void setcustomerName(String customerName){
		
		System.out.print("Enter in your name: ");
		customerName = keyboard.nextLine();
		this.customerName = customerName;
	}
	
	public int getcustomerNumber(){
		
		return customerNumber;
	}
	
	public void setcustomerNumber(int customerNumber){
		
		System.out.print("Enter in customer number: ");
		customerNumber = keyboard.nextInt();
		this.customerNumber = customerNumber;
	}
	
	public int getquantityOrdered(){
		
		return quantityOrdered;
	}
	
	public void setquantityOrdered(int quantityOrdered){
		
		System.out.print("Quantity orderd: ");
		quantityOrdered = keyboard.nextInt();
		this.quantityOrdered = quantityOrdered;
	}
	
	public float getunitPrice(){
		
		return unitPrice;
	}
	
	public void setunitPrice(float unitPrice){
		
		System.out.print("Price for each item: ");
		unitPrice = keyboard.nextFloat();
		this.unitPrice = unitPrice;
	}
	
	public float computePrice()
	{
		
		totalPrice = quantityOrdered * unitPrice;
		
		return totalPrice;
	}
	
	
	


}
