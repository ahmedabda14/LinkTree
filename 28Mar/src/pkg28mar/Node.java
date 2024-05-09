/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg28mar;

/**
 *
 * @author ahmed
 */
public class Node {
private Object element;
private Node next;
public Node(){
   this(null,null);
}
public Node(Object e, Node n){
    element = e;
    next =n;
}
    
}

