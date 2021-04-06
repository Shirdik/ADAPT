package deals.dealsmanager.Models;

public class DealAdder {

    private int userId;
    private int dealId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDealId() {
        return dealId;
    }

    public void setDealId(int dealId) {
        this.dealId = dealId;
    }

    public DealAdder(int userId, int dealId) {
        this.userId = userId;
        this.dealId = dealId;
    }

    public DealAdder() {
    }

}
