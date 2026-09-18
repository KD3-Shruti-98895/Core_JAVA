import java.util.Scanner;

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity); 
        setPricePerItem(pricePerItem); 
    }


    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }


    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    // Set and Get for pricePerItem
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
```

### InvoiceTest Class

```java
public class InvoiceTest {
    public static void main(String[] args) {
        // Create two Invoice objects
        Invoice invoice1 = new Invoice("A123", "Hammer", 5, 19.99);
        Invoice invoice2 = new Invoice("B456", "Screwdriver", -3, -5.50);

        // Display invoice 1 details
        System.out.println("Invoice 1 Details:");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: $" + invoice1.getPricePerItem());
        System.out.println("Total Invoice Amount: $" + invoice1.getInvoiceAmount());

        System.out.println("\n--------------------\n");

        // Display invoice 2 details (testing negative validation)
        System.out.println("Invoice 2 Details (Negative input test):");
        System.out.println("Part Number: " + invoice2.getPartNumber());
        System.out.println("Description: " + invoice2.getPartDescription());
        System.out.println("Quantity (should be 0): " + invoice2.getQuantity());
        System.out.println("Price per Item (should be 0.0): $" + invoice2.getPricePerItem());
        System.out.println("Total Invoice Amount: $" + invoice2.getInvoiceAmount());
    }
}


public class Q1 {
	public static void main(String [] args) {
		
	}
}
