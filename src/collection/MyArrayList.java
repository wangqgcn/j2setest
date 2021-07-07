package collection;

import charactor.AD;

/**
 * 自定义一个ArrayList
 * 增加add
 * 增加set,get
 * 增加remove
 */
public class MyArrayList<E> {

     private Object[] elementData;
     private int size;

     private static final int DEFAULT_CAPACITY = 10;

     public MyArrayList(){
         elementData = new Object[DEFAULT_CAPACITY];
     }

     public MyArrayList(int capacity){
         if(capacity<0)
             throw new RuntimeException("容器的容量不能为负数");
         else if (capacity==0)
             elementData = new Object[DEFAULT_CAPACITY];
         else
             elementData = new Object[capacity];

     }

     public void add(E element){
         //什么时候扩容？？
         if(size==elementData.length){
             Object[] newArray = new Object[elementData.length+(elementData.length>>1)];
             System.arraycopy(elementData,0,newArray,0,elementData.length);
             elementData = newArray;
         }
         elementData[size++] = element;
     }

     public E get(int index){
         if(index<0||index>size-1)
             throw new RuntimeException("索引不合法："+index);
         return (E)elementData[index];
     }

     public void set(E element,int index){
         if(index<0||index>size-1)
             throw new RuntimeException("索引不合法："+index);
         elementData[index] = element;
     }

     public void remove(E element){
         //将elemengt和所有元素依次比较，删除第一个相同的
         for (int i = 0; i < size; i++) {
             if(element.equals(elementData[i])){
                 //将该元素从此处移除
                 remove(i);
             }
         }
     }

     public  void remove(int index){
         int numMoved = elementData.length-index-1;
         if(numMoved>0){
             System.arraycopy(elementData,index+1,elementData,index,elementData.length-index-1);
         }
         elementData[--size] = null;
     }

     public String toString(){
         StringBuilder sb = new StringBuilder();

         sb.append("[");
         for (int i = 0; i < size; i++) {
             sb.append(elementData[i]).append(",");
         }
         sb.setCharAt(sb.length()-1,']');
         return sb.toString();
     }

}
