package 原型模式;

import java.io.*;

/**
 * 原型模式的实现很简单 只需要实现Cloneable 接口即可  重写 clone()
 * 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 * Cloneable 接口是一个空接口
 * super.clone()调用的是Object的clone()方法 clone()还是一个本地方法  【protected native Object clone() throws CloneNotSupportedException;】
 * Created by zhaihuilin on 2018/8/17 10:06.
 */
public class ProtoType2 implements Cloneable,Serializable{
  private static final long serialVersionUID = 1L;

  private  String Str;

  private  SerializableObj serializableObj;  //


  /**浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。

    深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。 **/

  /**
   * 深复制   ：  所谓的深复制就是对整个对象进行复制，不管是基本类型还是引用类型
   * 要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象。
   * @return
   * @throws CloneNotSupportedException
   */

  public Object deepClone() throws  Exception ,ClassNotFoundException {

    /***写入当前数据***/
    ByteArrayOutputStream  byteArrayOutputStream = new ByteArrayOutputStream();
    ObjectOutputStream  objectOutputStream =new ObjectOutputStream(byteArrayOutputStream);
    objectOutputStream.writeObject(this);


    /* 读出二进制流产生的新对象 */
    ByteArrayInputStream  byteArrayInputStream =new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    ObjectInputStream objectInputStream =new ObjectInputStream(byteArrayInputStream);

    System.out.println("{}:" +objectInputStream.readObject() );

    return objectInputStream.readObject();
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


  public static void main(String[] args) throws Exception {
     ProtoType2  p = new ProtoType2();
     p.deepClone();
  }


}
