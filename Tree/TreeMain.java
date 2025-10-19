package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.Tree;

public class TreeMain {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");

        drinks.addChild(hot);
        drinks.addChild(cold);

        System.out.println(drinks.print(0));
    }
}
