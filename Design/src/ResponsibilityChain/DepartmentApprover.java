package ResponsibilityChain;

/**
 * @author
 * @create 2020-09-24 15:43
 */
public class DepartmentApprover extends Approver{
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice()<=5000){
            System.out.println("请求编号id= " +purchaseRequest.getId() + " 被 " +this.name + " 处理" );
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
