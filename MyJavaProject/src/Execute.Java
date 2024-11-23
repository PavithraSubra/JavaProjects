class Customer {
    private String name;
    private String customerId;

    public void setCustomerName(String name)
    {
        this.name = name;
    }

    public String getCustomerName()
    {
        return this.name;
    }

    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }

    public String getCustomerId()
    {
        return this.customerId;
    }

}

class ElectronicsCityBranch implements IBank{

    public String createAccount(Customer customer){
        return "ACC1234";
    }
    public double issueVehicleLoan(String VehicleType , Customer customer){
        if(VehicleType == "Bike")
        {
            return 1000000;
        }
        else 
        {
            return 2000000;
        }

    }
    public double issueHomeLoan(Customer customer){
        return 2000000;

    }
    public double issueGoldLoan(Customer customer){
        return 1000000;

    }


    class Execute{

        public static void main(String[] args)
        {
            IBank bank = new ElectronicsCityBranch();
            Customer cust = new Customer();
            cust.setCustomerName("Pavi");
            cust.setCustomerId("cust001");
            String accntNo = bank.createAccount(cust);
            System.out.println(accntNo);
            double gLoanAmt= bank.issueGoldLoan(cust);
            System.out.println(gLoanAmt);
            double hLoanAmt = bank.issueHomeLoan(cust);
            System.out.println(hLoanAmt);
            double vLoanAmt = bank.issueVehicleLoan("bike", cust);
            System.out.println(vLoanAmt);
        }
    }

}