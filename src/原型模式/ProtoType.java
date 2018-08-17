package 原型模式;

/**
 * 原型模式的实现很简单 只需要实现Cloneable 接口即可  重写 clone()
 * 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 * Cloneable 接口是一个空接口
 * super.clone()调用的是Object的clone()方法 clone()还是一个本地方法  【protected native Object clone() throws CloneNotSupportedException;】
 * Created by zhaihuilin on 2018/8/17 10:06.
 */
public class ProtoType  implements Cloneable{

  @Override
  protected Object clone() throws CloneNotSupportedException {
    ProtoType protoType =(ProtoType)super.clone();
    return protoType;
  }
}
