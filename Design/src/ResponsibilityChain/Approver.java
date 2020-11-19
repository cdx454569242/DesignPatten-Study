package ResponsibilityChain;

/**
 * @author
 * @create 2020-09-24 15:41
 */
public abstract class Approver {
    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
