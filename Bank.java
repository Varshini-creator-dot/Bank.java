class bank {
public double calculateBalance(double amount)
{
return amount;
}
public double calculateBalance(double amount1,double amount2)}
{
return amount1 + amount2
}
public double calculateBalance(double amount1, double amount2, double interestRate)
{
return (amount1 + amount2) * (1 + interestRate / 100);
}
}
public class BankoverloadingExample{
public static void main(String[]args)
{
Bank bank= new Bank();
double balance1 = bank.calculatteBalance(1000.00);
System.out.println("Balance for single account:"+balance1);

double balance2 = bank.calculateBalance(1000.00, 2000.00);
System.out.println("Total balance for multiple account: " + balance2);

double balance3 = bank.calculateBalance(1000.00, 2000.00, 5.0);
System.out.println("Total balance e=with interest: " + balance3);
}
}
