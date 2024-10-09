class PhoneCompany {

    // Parent class constructor
    PhoneCompany() {
        System.out.println("Super Constructor");
    }

    // Parent class variable
    String Pcname = "Google";
    
    // Parent class method
    void makePhone() {
        System.out.println("Making Phones");
    }
}

class CompanyOne extends PhoneCompany {

    // Child class constructor
    CompanyOne() {
        // Explicitly calling the parent class constructor using super()
        super();
        System.out.println("SubClass Constructor");
    }
    
    // Child class variable
    String name = "Motorola";
    
    // Child class method
    void maker() {
        // Using super to access parent class variable
        System.out.println("Parent Company Name: " + super.Pcname);
        
        // Using super to call the parent class method
        super.makePhone();
        
        // Child class specific behavior
        System.out.println(name + " Makes Phones");
    }
}

public class SuperKeywordUses {
    public static void main(String[] args) {
        // Creating an object of the subclass
        CompanyOne ob = new CompanyOne();
        
        // Calling the maker method to demonstrate the uses of super keyword
        ob.maker();
    }
}
