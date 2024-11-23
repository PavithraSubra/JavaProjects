public interface IBank {

    int caution_Money = 2000;
    String createAccount(Customer customer);
    double issueVehicleLoan(String VehicleType , Customer customer);
    double issueHomeLoan(Customer customer);
    double issueGoldLoan(Customer customer);

}