package Bridge;

import Bridge.Brand.XiaoMi;
import Bridge.Phone.FoldedPhone;

/**
 * @author
 * @create 2020-09-20 20:23
 */
public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.call();
    }
}
