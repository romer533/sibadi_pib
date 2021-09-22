package java.romer533.dto;

import java.util.ArrayList;

public class ReportDto {

    private int amountEarned;
    private int amountSealed;
    private final ArrayList<CheckDto> checks = new ArrayList<>();

    public ReportDto() {
        System.out.println("Report{" +
                "amountEarned=" + amountEarned +
                ", amountSealed=" + amountSealed +
                ", checks=" + checks +
                '}');
    }

    public void setAmountEarned(int amountEarned) {
        this.amountEarned = this.amountEarned + amountEarned;
    }

    public void setAmountSealed(int amountSealed) {
        this.amountSealed = this.amountSealed + amountSealed;
    }

    public void setCheck(CheckDto check) {
        this.checks.add(check);
    }

    @Override
    public String toString() {
        return "Report{" +
                "checks=" + checks +
                "\n\ntotal: amountEarned=" + amountEarned +
                ", amountSealed=" + amountSealed +
                '}';
    }
}
