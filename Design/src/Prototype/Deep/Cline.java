package Prototype.Deep;

/**
 * @author
 * @create 2020-09-19 20:12
 */
public class Cline {
    public static void main(String[] args) throws CloneNotSupportedException {

        DeepProtoType deepProtoType = new DeepProtoType("abc",new DeepCloneableTarget("targer","clone"));

        //方式一完成深拷贝 通过重写拷贝方法
//        DeepProtoType clone1 = (DeepProtoType)deepProtoType.clone();
//        DeepProtoType clone2 = (DeepProtoType)deepProtoType.clone();
//
//        System.out.println(deepProtoType.hashCode());
//        System.out.println(clone1.hashCode());
//        System.out.println(clone2.hashCode());

        //方式二完成深拷贝 通过序列化方式
        DeepProtoType clone1 = (DeepProtoType)deepProtoType.deepClone();
        DeepProtoType clone2 = (DeepProtoType)deepProtoType.deepClone();

        System.out.println(deepProtoType.hashCode());
        System.out.println(clone1.hashCode());
        System.out.println(clone2.hashCode());
    }
}
