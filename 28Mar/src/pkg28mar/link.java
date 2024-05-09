/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg28mar;

import java.util.Scanner;

/**
 *
 * @author ahmed
 */
class Node {
private int data;
private Node next;
public Node(){
data =0 ;
next = null;
}
public Node(int e, Node n){
    data = e;
    next =n;
}

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
class LinkedList{
    private Node head;
    private int size;
    public LinkedList(){
        head = null;
        size=0;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else 
            return false;
    }
public int getListSize(){
    return size;
}
//implement the insertion operation
//1. Insertion at first head
public void InsertAtFirst(int val){
    Node n;
    n = new Node();
    n.setData(val);
    n.setNext(head);
    head=n;
    size++;
}
//2. Insertion at last
public void InsertAtLast(int val){
    Node n,t;
    n=new Node();
    n.setData(val);
t=head;
if(t==head){
    head=n;
}
else{
    while(t.getNext()!=null)
        t.setNext(n);   
}
t.getNext();
size++;
}
public void insertAtPosition(int val, int pos){
    if(pos==1)
        InsertAtFirst(val);
    else if(pos==size+1)
                InsertAtLast(val);
    else if (pos>1&&pos<=size){
        Node n,t;
        n= new Node(val,null);
        t=head;
        for(int i=1;i<pos-1;i++)
            t=t.getNext();
        n.setNext(t.getNext());
        t.setNext(n);
        size++;
    }else{
        System.out.println("It is impossible to insert at given position");
    }

}
//deletion operations
//4. delete at first head
public void deleteFirst(){
    if (head==null)
        System.out.println("LL is empty");
    else
        head= head.getNext();
    size--;
}
public void deleteLast(){
  if (head==null)
        System.out.println("LL is empty");
  else if(size ==1){
      head =null;
      size--;
  }else{
      Node t;
      t=head;
      for(int i=1;i<size-1;i++){
          t.getNext();
          t.setNext(null);
          size--;
      }
  }
  
      
}
public void deletePos(int pos){
    if(head==null)
        System.out.println("ll is empty");
    else if (pos==1)
        deleteFirst();
    else{
        Node t,t1;
        t=head;
        for(int i =1;i<pos-1;i++){
            t=t.getNext();
        }
        t1=t.getNext();// it will throw the position of node's next address
        t1.setNext(t.getNext());
        size--;
    }
}

public int searchItem (int key){
       Node current = head;
int position =1;
while(current != null){
    if(current.getData()==key)
    {
        return position;
}
current=current.getNext();
position++;
}
return -1;
        }
public void viewLL(){
    Node r;
    if(isEmpty()){
        System.out.println("LL is empty");
        
    }else{
        r=head;
        for(int i=1;i<=size;i++){
            System.out.println(r.getData()+ " -> ");
            r=r.getNext();
        }
    }
}
}


public class link {
            public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
              LinkedList list = new LinkedList();
              boolean flag =true;
              while(flag){
                  System.out.println("1. add item at the head");
                                    System.out.println("2. add item at the tail");
                  System.out.println("3. add item at the given position");
                  System.out.println("4. delete item at the head");
                  System.out.println("5. delete item to the list at the head");
                  System.out.println("6. delete item at last");
                  System.out.println("7. search item");
                                    System.out.println("8. view item");
int choice = kb.nextInt();
int pos,val;
switch(choice){
    case 1: 
        System.out.println("Enter the value");
        val = kb.nextInt();
        list.InsertAtFirst(val);
        break;
    case 2:
      System.out.println("Enter the value");
        val = kb.nextInt();
        list.InsertAtLast(val);   
        break;
    case 3:
         System.out.println("Enter the value");
        val = kb.nextInt();
                 System.out.println("Enter the value");
                         pos = kb.nextInt();
        list.insertAtPosition(val,pos);   
        break;
    case 4:
        list.deleteFirst();;
        break;
    case 5:
        list.deleteLast();
        break;
    case 6:
           System.out.println("Enter the value");
        pos = kb.nextInt();
        list.deletePos(pos);
        break;
    case 7:
           System.out.println("Enter the value");
        val = kb.nextInt();
        int result= list.searchItem(val);
        if(result!=-1){
            System.out.println("item found at: "+result);
            
        }
        else
            System.out.println("item not found");
    case 8:
        list.viewLL();
        break;
    default:
        System.out.println("Invalid option ");
        
}
                  

              }
            }
}
