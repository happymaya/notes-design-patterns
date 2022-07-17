package cn.happymaya.ndp.structural.composite;

import java.util.List;

/* 组合节点 */
public class Node extends Component{

    /* 存放子节点列表 */
    private List<Component> childrenList;

    @Override
    public void operation() {
        for (Component component : childrenList) {
            component.operation();
        }
    }

}
