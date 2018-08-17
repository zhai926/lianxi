package 组合模式;

/**
 * Created by zhaihuilin on 2018/8/17 12:00.
 */
public class Tree {

    private  TreeNode  node =null;

    public Tree(String name) {
      this.node = new TreeNode(name);
    }

  public static void main(String[] args) {
     Tree tree = new Tree("A");

     TreeNode  treeNode1 = new TreeNode("B");

     TreeNode  treeNode2 = new TreeNode("C");

     treeNode1.add(treeNode2);
     tree.node.add(treeNode1);

    System.out.println("build the tree finished!");
  }
}
