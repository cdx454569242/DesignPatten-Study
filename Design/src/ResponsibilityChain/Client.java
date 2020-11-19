package ResponsibilityChain;

/**
 * @author
 * @create 2020-09-24 15:47
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 15000, 3);
        DepartmentApprover D = new DepartmentApprover("部门");
        CollegeApprover C = new CollegeApprover("学院");
        SchoolMasterApprover S = new SchoolMasterApprover("校长");

        D.setApprover(C);
        C.setApprover(S);
        S.setApprover(D);

        D.processRequest(purchaseRequest);


    }
}
