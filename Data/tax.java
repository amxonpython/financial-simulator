package Data;

import java.math.BigDecimal;

public class tax {
    public static BigDecimal NonTaxableLimit = new BigDecimal(210_000);

    public static BigDecimal Tax = new BigDecimal(0.13);

    public static BigDecimal AmountForA13PercentTax = new BigDecimal(2_400_000);
    public static BigDecimal AmountForA18PercentTax = new BigDecimal(5_000_000);
    public static BigDecimal AmountForA20PercentTax = new BigDecimal(20_000_000);
    public static BigDecimal AmountForA22PercentTax = new BigDecimal(50_000_000);

    //public static BigDecimal postTaxIncome = Data.income.multiply(tax.Tax);

    public static void calculateTheTax(){
        Tax = BigDecimal.valueOf(0.13);
        if (Data.income.compareTo(NonTaxableLimit) > 0){
            Tax = BigDecimal.valueOf(0.13);
            if (Data.income.compareTo(AmountForA13PercentTax) > 0){
                Tax = BigDecimal.valueOf(0.15);
            } else if (Data.income.compareTo(AmountForA18PercentTax) > 0) {
                Tax = BigDecimal.valueOf(0.18);
            } else if (Data.income.compareTo(AmountForA20PercentTax) > 0) {
                Tax = BigDecimal.valueOf(0.20);
            } else if (Data.income.compareTo(AmountForA22PercentTax) > 0) {
                Tax = BigDecimal.valueOf(0.22);
            }
        }
    }
    public static void showTheTax(){
        System.out.println("налоговая ставка: " + Tax);
    }
}
