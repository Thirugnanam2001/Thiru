package tax;

import java.sql.Driver;

interface Taxable{
        double SALES_TAX = 7;
        double INCOME_TAX = 10.5;
        void calculateTax();
    }
     class Employee implements Taxable {
        private int empId;
        private String name;
        private double salary;


         public Employee(int empId,String name,double salary){
            this.empId =empId;
            this.name = name;
            this.salary = salary;
        }

        @Override
         public void calculateTax(){
            double incomeTax = salary * 12 * INCOME_TAX;
            System.out.println(" Income Tax for "+name+" (ID: "+ empId + "): Rs. "+ incomeTax);
        }

    }
    class product implements Taxable{
        private int pid;
        private double price;
        private int quantity;

        public  product(int pid, double price, int quantity){
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }
        @Override
        public void calculateTax(){
            double salesTax = price * SALES_TAX;
            System.out.println(" Sales Tax on product (ID: "+ pid + "): Rs. "+ salesTax);
        }

    }




