import java.util.UUID;
import  java.util.*;


public class SBIUser implements BankInterface {
  private String name;
  private String accountNo;
  private Double balance;
  private  String password;
  private  Double rateOfInterest;

  public SBIUser(String name, Double balance, String password) {
    this.name = name;
    this.balance = balance;
    this.password = password;
  // Bank is initizaling

    this.rateOfInterest = 6.5;
    this.accountNo = String.valueOf(UUID.randomUUID());

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Double getRateOfInterest() {
    return rateOfInterest;
  }

  public void setRateOfInterest(Double rateOfInterest) {
    this.rateOfInterest = rateOfInterest;
  }


    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "your new balance is :" + balance;

    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
          if (amount >balance){
            return  "Sorry bro!No money";
          }
          else {
            balance = balance - amount;
            return " Paisa hi paisa ";

          }
        }else {
          return  "wrong password";

        }

   }

    @Override
    public double calculateInterest(int years) {
        return (balance * years* rateOfInterest)/100;
    }
}


