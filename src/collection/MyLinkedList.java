package collection;

/**
 * 自定义一个LinkedList
 * add,remove,get,insert,
 */
public class MyLinkedList {

    private Node first;
    public Node last;
    private int size;

    private void checkRange(int index){
        if(index<0||index>=size){
            throw new RuntimeException("索引数字不合法："+index);
        }
    }

    public void add(int index,Object obj){

        checkRange(index);

        Node newNode = new Node(obj);
        Node temp = getNode(index);
        if (temp!=null) {
            Node up = temp.previous;

            up.next = newNode;
            newNode.previous = up;

            newNode.next = temp;
            temp.previous = newNode;
        }
        size++;
    }

    public void remove(int index){

        checkRange(index);

        Node temp = getNode(index);
        if(temp!=null){
            Node up = temp.previous;
            Node down = temp.next;
            if(up!=null)
                up.next = down;
            if(down!=null)
                down.previous = up;
            if(index==0)
                first = down;
            if(index==size-1)
                last = up;
            size--;
        }
    }

    private Node getNode(int index){
        checkRange(index);
        Node temp = null;

        if(index<(size>>1)){
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }else {
            temp = last;
            for (int i =size-1; i > index ; i--) {
                temp = temp.previous;
            }
        }
        return temp;
    }

    public Object get(int index){
        checkRange(index);
        return getNode(index).element;
    }

    //[]
    //["a"]
    public void add(Object obj){
        Node node = new Node(obj);

        if(first==null){
            first = node;
            last = node;
        }else{
            node.previous = last;
            node.next = null;

            last.next = node;
            last = node;
        }
        size++;
    }

    @Override
    public String toString() {
        //[a,b,c]    first=a  last=c
        StringBuilder sb = new StringBuilder("[");
        Node temp = first;
        while (temp!=null){
            sb.append(temp.element).append(",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();

    }

}
