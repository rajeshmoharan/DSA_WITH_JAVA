package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.Tree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode data){
        this.children.add(data);
    }

    public String print(int level){
        String ret;
        ret = "".repeat(level)+data+"\n";
        for(TreeNode node:this.children){
            ret += node.print(level);
        }
        return ret;
    }
}
