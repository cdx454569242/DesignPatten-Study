package Adapter.InterfaceAdpter;

/**
 * @author
 * @create 2020-09-20 19:32
 */
public class Client {
    public static void main(String[] args) {

        InterfaceAdapter interfaceAdapter = new InterfaceAdapter(){
            //选择自己想要重写的适配方法 然后进行覆盖即可
            @Override
            public void method1() {
                System.out.println("适配了M1接口");
            }
        };
        interfaceAdapter.method1();

    }
}
