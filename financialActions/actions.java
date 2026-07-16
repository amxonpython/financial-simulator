package financialActions;

import Data.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class actions {
    public static Scanner scanner = new Scanner(System.in);

    public static void showTheBalance(){
        System.out.println("ваш баланс составляет: " + Data.balance);
    }
    public static void specifyTheBasicValues(){
        System.out.println("введиде свой баланс:");
        BigDecimal balance = scanner.nextBigDecimal();
        Data.balance = balance;

        System.out.println("введите доход:");
        BigDecimal income = scanner.nextBigDecimal();
        Data.income = income;

        System.out.println("укажити свои расходы: ");
        BigDecimal expenses = scanner.nextBigDecimal();
        Data.expenses = expenses;

        tax.calculateTheTax();
    }
    public static void TopUpYourBalance(){
        System.out.println("введите сумму для попалнения:");
        BigDecimal sum = scanner.nextBigDecimal();
        Data.balance = Data.balance.add(sum);
    }
    public static void ReduceTheBalance(){
        System.out.println("введите сумму для снятия: ");
        BigDecimal sum = scanner.nextBigDecimal();
        Data.balance = Data.balance.subtract(sum);
    }
    public static void simulateABalanceChange(){
        Data.balance = Data.balance.add(Data.profit);
        Data.balance = Data.balance.add(contribution.depositIncomeS);
    }
    public static void showProfit(){
        System.out.println("общая прибыль: " + Data.profit);
    }
}