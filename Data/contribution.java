package Data;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class contribution {
    public static BigDecimal annualRate = new BigDecimal("1.09");
    public static BigDecimal depositIncomeS = new BigDecimal (String.valueOf(Data.balance.multiply(annualRate))).subtract(Data.balance);

    //public static BigDecimal depositIncomeS1 = new BigDecimal(String.valueOf(depositIncomeS.subtract(Data.balance)));


    public static void depositIncome(){
       depositIncomeS = (Data.balance.multiply(annualRate)).subtract(Data.balance);
       BigDecimal a = new BigDecimal (12);
        depositIncomeS = depositIncomeS.divide(
                BigDecimal.valueOf(12),
                2,
                RoundingMode.HALF_UP
        );
    }

    public static void showDepositIncome(){
        System.out.println("доход по вкладу (ставка по умолчанию: 9% годовых): " + depositIncomeS);
    }
}
