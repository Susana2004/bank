class BankCustomer {
    String cust_name;
    int acc_no;
    int cust_age;

    BankCustomer(String cust_name, int acc_no, int cust_age) {
        this.cust_name = cust_name;
        this.acc_no = acc_no;
        this.cust_age = cust_age;
    }

    public void display() {
        System.out.println("Customer name: " + cust_name);
        System.out.println("Account number: " + acc_no);
        System.out.println("Customer age: " + cust_age);
    }
}

public class Main {
    public static void main(String[] args) {
        BankCustomer c = new BankCustomer("Susana", 147213, 23);
        c.display();
    }
}
