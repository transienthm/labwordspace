package org.java.bin.pattern.composite;

/**
 * Created by wangbin on 2017/1/26.
 */
public interface Component {
    void operation();
}

interface Leaf extends Component {

}

interface Composite extends Component {
    void add(Component c);

    void remove(Component component);

    Component getChild(int index);
}
