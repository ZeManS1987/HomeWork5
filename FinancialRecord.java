import java.io.Serializable;
import java.util.Random;

public class FinancialRecord {
    Random random = new Random();
    int incomes = random.nextInt(10000);
    int outcomes = random.nextInt(10000);

    public FinancialRecord() {
    }

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }
}
