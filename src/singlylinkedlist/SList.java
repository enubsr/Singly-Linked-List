/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author Enubs
 */
public class SList<E> {

    private SNode<E> head, tail;
    private int size;

    //Constructor to create list
    public SList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public SNode first() {
        return head;
    }

    public SNode last() {
        return tail;
    }

    public void addFirst(SNode newNode) {
        newNode.setNext(head);
        head = newNode;
        if (isEmpty()) {
            tail = newNode;
            head.setNext(tail);
        }
        size++;
    }

    //Activity for June 18
    public void addLast(SNode newNode) {
        tail.setNext(newNode);
        tail = newNode;
        size++;
    }
    
    //Activity for June 18
    public SNode removeFirst(){
        SNode<E> tempNode = head;
        head = head.getNext();
        tempNode.setNext(null);
        size--;
        return tempNode;
    }

    public void showList() {
//        System.out.print(head.getElement());
//        System.out.print(head.getNext().getElement());
//        System.out.print(head.getNext().getNext().getElement());
//        
        SNode temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print("[" + temp.getElement() + "]");
            temp = temp.getNext();
        }
    }
}
