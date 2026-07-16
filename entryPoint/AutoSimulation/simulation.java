package entryPoint.AutoSimulation;

import Data.Data;
import financialActions.actions;
import Data.tax;
import Data.*;

import java.math.BigDecimal;

public class simulation {
    public static int numberOfCycles = 12;

    public static void runningTheSimulation (){
        actions.specifyTheBasicValues();
        //в цикле сама симуляция
        for (int i = 1; i <= numberOfCycles; i++){
            System.out.println(i + " месяц:");

            simulateAMonth(true);

            //разделитель типооооо тёпленькое пошло, а ой
            //фу покажи
            System.out.println();
        }
    }
    public static void simulateAMonth(boolean profitData){
        tax.calculateTheTax();
        contribution.depositIncome();
        Data.updateTheValue();
        actions.simulateABalanceChange();
        if (profitData){
            contribution.showDepositIncome();
            actions.showTheBalance();
            tax.showTheTax();
            actions.showProfit();
        }
    }
}