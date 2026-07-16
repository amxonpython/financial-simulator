package entryPoint;

import entryPoint.help.help;
import entryPoint.AutoSimulation.simulation;

import java.util.Scanner;

public class Main{
    public static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        boolean working = true;
        while (working){
            System.out.print("command: ");

            String use_scan = scanner.nextLine().trim();

            switch (use_scan){
                case "help":
                    help.ListOfCommands();
                    break;
                case "autoSim", "run the simulation: auto":
                    simulation.runningTheSimulation();
                    break;
                case "run the simulation: not auto", "sim":
                    ManagementViaTheConsole.mainConsul();
                    break;
                case "exit":
                    working = false;
                    break;
                default:
                    System.out.println("команда не найдена");
                    break;
            }
        }
    }
}