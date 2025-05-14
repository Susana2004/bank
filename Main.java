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

class TransactionHistory  {
    int id;
    String sname;
    String rname;
    String date;
    String status;

    TransactionHistory(int ID, String s , String  r,String dob,String stat) 
    {
        id = ID;
        sname = s;
        rname = r;
        date = dob;
        status = stat;
    }


    public void display() {
        System.out.println("Transaction id: " + id);
        System.out.println("Sender name: " + sname);
        System.out.println("Receiver's name: " + rname);
        System.out.println("Transaction status: " + status);
        System.out.println("Transaction Date: " + date);
    }
}

public class Main {
    public static void main(String[] args) {
        BankCustomer c = new BankCustomer("Susana", 147213, 23);
        c.display();
    
        TransactionHistory t = new TransactionHistory(111, "nikhil", "ranjith", "04-05-2025", "successful");
        t.display();
    }
}
