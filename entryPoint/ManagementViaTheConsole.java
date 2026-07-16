package entryPoint;

import Data.Data;
import financialActions.actions;
import entryPoint.AutoSimulation.simulation;

import java.util.Scanner;

public class ManagementViaTheConsole {
    public static void mainConsul(){
        Scanner scanner = new Scanner(System.in);

        boolean working = true;

        actions.specifyTheBasicValues();

        Data.updateTheValue();
        while (working){
            actions.showTheBalance();

            sysData.actions.displayAvailableActions();

            System.out.println("выберите действие:");
            int action = scanner.nextInt();

            switch (action){
                case 0:
                    actions.showTheBalance();
                    break;
                case 1:
                    actions.TopUpYourBalance();
                    break;
                case 2:
                    actions.ReduceTheBalance();
                    break;
                case 3:
                    simulation.simulateAMonth(false);
                    actions.showProfit();
                    break;
                case 4:
                    actions.showProfit();
                    break;
                case 5:
                    working = false;
                    break;
            }
        }
    }
}