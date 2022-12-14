import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        String fileToWrite = "C:\\Users\\LEO\\IdeaProjects\\HomeWork5\\src\\report_2.txt";

        FinancialRecord financialRecord = new FinancialRecord();
        FinancialRecord financialRecord1 = new FinancialRecord();
        FinancialRecord financialRecord2 = new FinancialRecord();
        FinancialRecord financialRecord3 = new FinancialRecord();
        FinancialRecord financialRecord4 = new FinancialRecord();
        FinancialRecord financialRecord5 = new FinancialRecord();
        FinancialRecord financialRecord6 = new FinancialRecord();
        FinancialRecord financialRecord7 = new FinancialRecord();
        FinancialRecord financialRecord8 = new FinancialRecord();
        FinancialRecord financialRecord9 = new FinancialRecord();


        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite))){
            writer.write(String.valueOf(financialRecord.incomes));
            writer.write(String.valueOf("; " + financialRecord.outcomes));
            writer.newLine();
            writer.write(String.valueOf(financialRecord1.incomes));
            writer.write(String.valueOf("; " + financialRecord1.outcomes));
            writer.newLine();
            writer.write(String.valueOf(financialRecord2.incomes));
            writer.write(String.valueOf("; " + financialRecord2.outcomes));
            writer.newLine();
            writer.write(String.valueOf(financialRecord3.incomes));
            writer.write(String.valueOf("; " + financialRecord3.outcomes));
            writer.newLine();
            writer.write(String.valueOf(financialRecord4.incomes));
            writer.write(String.valueOf("; " + financialRecord4.outcomes));
            writer.newLine();
            writer.write(String.valueOf(financialRecord5.incomes));
            writer.write(String.valueOf("; " + financialRecord5.outcomes));
            writer.newLine();
            writer.write(String.valueOf(financialRecord6.incomes));
            writer.write(String.valueOf("; " + financialRecord6.outcomes));
            writer.newLine();
            writer.write(String.valueOf(financialRecord7.incomes));
            writer.write(String.valueOf("; " + financialRecord7.outcomes));
            writer.newLine();
            writer.write(String.valueOf(financialRecord8.incomes));
            writer.write(String.valueOf("; " + financialRecord8.outcomes));
            writer.newLine();
            writer.write(String.valueOf(financialRecord9.incomes));
            writer.write(String.valueOf("; " + financialRecord9.outcomes));
            writer.newLine();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToWrite))){
            String reads = read(bufferedReader);
            System.out.println(reads);

        }

    }
    public static String read(BufferedReader reader) throws IOException {
        int incomes = 0;
        int outcomes = 0;
        String result = "";
        while (reader.ready()){
            String line = reader.readLine();
            String[] finance = line.split("; ");
            for(int i = 0; i < finance.length; i++){
                if(i % 2 == 0){
                    int resultIncomes = Integer.parseInt(finance[i]);
                    incomes += resultIncomes;
                }
                else {int resultOutcomes = Integer.parseInt(finance[i]);
                outcomes += resultOutcomes;}
            }

        }
        return result+= "Общий доход - " + incomes + "\n" + "Общий расход - " +  outcomes;
    }

}
