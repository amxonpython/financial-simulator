package Data;

import java.math.BigDecimal;

public class Data {
    public static BigDecimal income = BigDecimal.valueOf(0);
    public static BigDecimal balance = BigDecimal.valueOf(0);
    public static BigDecimal expenses = BigDecimal.valueOf(0);

    public static BigDecimal profit = income.subtract(expenses).multiply(tax.Tax);

    public static void updateTheValue(){
        BigDecimal theAmountOfTax = income.multiply(tax.Tax);
        profit = income.subtract(expenses).subtract(theAmountOfTax);
    }
}