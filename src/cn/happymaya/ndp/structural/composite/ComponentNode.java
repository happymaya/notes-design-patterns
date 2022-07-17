package cn.happymaya.ndp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ComponentNode extends AbstractNode{

    private List<AbstractNode> children;
    private int id;
    private int pid;

    public ComponentNode() {
        children = new ArrayList<AbstractNode>();
    }

    @Override
    public boolean isRoot() {
        return -1 == pid;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getParentId() {
        return pid;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setParentId(int parentId) {
        this.pid = parentId;
    }

    @Override
    public void add(AbstractNode abstractNode) {
        abstractNode.setParentId(this.pid + children.size());
        abstractNode.setId(abstractNode.getParentId() + 1);
        children.add(abstractNode);
    }

    @Override
    public void remove(AbstractNode abstractNode) {
        children.remove(abstractNode);
    }

    @Override
    public AbstractNode getChild(int i) {
        return children.get(i);
    }

}
