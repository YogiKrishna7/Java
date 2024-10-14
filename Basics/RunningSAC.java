class SupplierAndConsumer {
    int quantity = 1000;

    // Method for consumer to get items
    synchronized void getQuantity(int q) {
        System.out.println("Getting items");

        if (q > this.quantity) {
            System.out.println("The customer doesn't have enough quantity");
            try {
                wait();  // Wait for the supplier to supply more items
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (q <= this.quantity) {
            quantity -= q;
            System.out.println("Got all the items. Remaining quantity: " + quantity);
        }
    }

    // Method for supplier to supply items
    synchronized void supplyItems(int suppliedQuantity) {
        System.out.println("Supplying Quantity");
        quantity += suppliedQuantity;
        System.out.println("Total quantity after supply: " + quantity);
        notify();  // Notify the waiting consumer
    }
}

class SAC1 extends Thread {
    SupplierAndConsumer store;

    // Constructor to receive the store reference
    SAC1(SupplierAndConsumer store) {
        this.store = store;
    }

    // Consumer thread that tries to get 10000 items
    public void run() {
        store.getQuantity(10000);
    }
}

class SAC2 extends Thread {
    SupplierAndConsumer store;

    // Constructor to receive the store reference
    SAC2(SupplierAndConsumer store) {
        this.store = store;
    }

    // Supplier thread that supplies 20000 items
    public void run() {
        store.supplyItems(20000);
    }
}

public class RunningSAC {
    public static void main(String[] args) {
        // Shared resource: store object (SupplierAndConsumer)
        SupplierAndConsumer store = new SupplierAndConsumer();

        // Create consumer and supplier threads
        SAC1 consumer = new SAC1(store);
        SAC2 supplier = new SAC2(store);

        // Start both threads
        consumer.start();
        supplier.start();
    }
}
