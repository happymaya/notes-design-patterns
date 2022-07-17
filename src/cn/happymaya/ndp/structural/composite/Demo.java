package cn.happymaya.ndp.structural.composite;

public class Demo {
    public static void main(String[] args) {
        AbstractNode rootNode = new ComponentNode();
        rootNode.setId(0);
        rootNode.setParentId(-1);

        AbstractNode node = new ComponentNode();
        node.add(new ComponentLeaf());
        node.add(new ComponentLeaf());

        rootNode.add(new ComponentLeaf());
        rootNode.add(new ComponentLeaf());
        rootNode.add(node);

        System.out.println(node.getId());
    }
}
