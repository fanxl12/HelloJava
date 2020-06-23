package com.fanxl.data.structure.linked;


public class MySingleLinked<E> {

    private transient Node<E> first;

    private transient int size = 0;

    private transient Node<E> last;

    public MySingleLinked() {

    }

    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    public void add(int index, E element) {
        checkPositionIndex(index);
        if (index == size) {
            addLast(element);
        } else {
            linkBefore(element, node(index));
        }
    }

    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        if (next == null) {

        }
        x.item = null;
        size--;
        return element;
    }

    void linkBefore(E e, Node<E> succ) {
        final Node<E> next = succ.next;
        final Node<E> newNode = new Node<>(e, next);
        succ.next = newNode;
        if (next == null) {
            last = newNode;
        }
        size++;
    }


    Node<E> node(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void addFirst(E e) {
        linkFirst(e);
    }

    public void addLast(E e) {
        linkLast(e);
    }

    private void linkFirst(E e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(e, f);
        first = newNode;
        if (f == null) {
            last = f;
        }
        size++;
    }

    /**
     * 添加一个元素到最后
     * @param e
     */
    private void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException("index is invalid");
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException("index is invalid");
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

}
