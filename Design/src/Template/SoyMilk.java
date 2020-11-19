package Template;

/**
 * @author
 * @create 2020-09-22 15:44
 */
public abstract class SoyMilk {
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步 选择新鲜的黄豆");
    }

    abstract void addCondiments();

    void soak(){
        System.out.println("第三步 黄豆和配料浸泡");
    }

    void beat(){
        System.out.println("第四步 将黄豆和配料放入豆浆机打碎");
    }
}
