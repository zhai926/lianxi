package 原型模式;

import java.io.Serializable;

/**
 * 原型模式的实现很简单 只需要实现Cloneable 接口即可  重写 clone()
 * 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 * Cloneable 接口是一个空接口
 * super.clone()调用的是Object的clone()方法 clone()还是一个本地方法  【protected native Object clone() throws CloneNotSupportedException;】
 * Created by zhaihuilin on 2018/8/17 10:06.
 */
public class ProtoType1 implements Cloneable,Serializable{
  private static final long serialVersionUID = 1L;

  private  String Str;

  private  SerializableObj serializableObj;  //



  /**
   * 浅复制   ：  所谓的浅复制就是 对 基本类型的数据进行复制，而引用类型的数据还是指向原来的引用地址
   * @return
   * @throws CloneNotSupportedException
   */
  @Override
  protected Object clone() throws CloneNotSupportedException {
    ProtoType1 protoType =(ProtoType1)super.clone();
    return protoType;
  }


  public String getStr() {
    return Str;
  }

  public void setStr(String str) {
    Str = str;
  }

  public SerializableObj getSerializableObj() {
    return serializableObj;
  }

  public void setSerializableObj(SerializableObj serializableObj) {
    this.serializableObj = serializableObj;
  }


  class  SerializableObj implements Serializable{
    private static final long serialVersionUID = 1L;
  }

}
