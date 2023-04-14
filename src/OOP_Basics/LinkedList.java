package OOP_Basics;

public class LinkedList<T> {
      LinkedList<T> head = null;
//    Node tail = null;
//    public static class Node<T>
//    {
//        T data;
//        Node<T> next;
//        Node<T> prev;
//        Node(T data, Node<T> next, Node<T> prev)
//        {
//            this.data = data;
//            this.next = next;
//            this.prev = prev;
//        }
//
//  }
    private static class Entry<E>
    {
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry(E element, Entry<E> next, Entry<E> prev)
        {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    public 
}
