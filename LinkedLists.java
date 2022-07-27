import java.io.*;
import java.util.*;
//Greg Sciame, collaborators: Nicole C, Wayne T, Stacy G
/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
✅ add(string value)
✅ get(int index);
✅ toString()


Intermediate (at least add, size + one of the other two)
------------
✅ size()
✅ add(int index,String value)
✅ indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
  Node first = new Node(value);
  first.setNext(head);
  //another one line way to do the above...
  //Node first = new Node(value, head);
    
    
  head = first;
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    Node walker = head;
    int i = 0;
    while(index != i){ // while loop through the data to find element at a specific location
      i++;
      walker = walker.getNext(); // gets the next value of Walker
    }
    //head.getNext(index);
    return walker.getData();  // Returns the value at the index of Walker
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    String str = "";
    int i = 0;
    Node walker = head;  // set walker to head
    while (walker != null){ // do a while loop instead of a for loop - size is not defined
      
      str += walker.getData() + "-->"; // adds the data to a string
      walker = walker.getNext();  // add each element until you reach null
    }
    return str; 
  }

  /**
  returns the number of elements in the list
  */
  public int size(){

    int i = 0; // set index to first element
    Node walker = head; // set Walker to head
    while(walker !=null) {

      walker = walker.getNext();
      i++;
       
    }
    return i;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){ 
    int i = 0;
    Node brand_new = new Node(value); // create new node with a given element
    Node walker = head;//start traversing at the head 
      
    if(index==0){ // if added to the head go back to orginal add method with one argument
      add(value);
    } else {
      while(index-1 != i){//keep doing this until we get to the node right before where we want to insert
        i++;//increment the counter variable
        walker = walker.getNext();//assign walker to point to the next node 
      }
      brand_new.setNext(walker.getNext()); //sets it to the value of the next node, since we stopped at the node before where we want to insert
      walker.setNext(brand_new); //walker now has the value that brand_new is currently set at 
      //the last item of a linkedlist is always null - therefore adding to end of list is not a special case 
    }
  }

/*
  public void add(String value){
  Node first = new Node(value);
  first.setNext(head);
  //another one line way to do the above...
  //Node first = new Node(value, head);
    
    
  head = first;
  }
*/
  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
 
  public int indexOf(String value){
    int i = 0;
    Node walker = head;
    while(walker.getData() != value){
      walker = walker.getNext();      //add something here
      i++;
    }
    return  i;
  }

  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    return null;
  }

  
  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
    int i = 0;
    
  }
}

/*
our add() method with 2 parameters, for research to use on writing remove()...
public void add(int index, String value){ 
    int i = 0;
    Node brand_new = new Node(value); // create new node with a given element
    Node walker = head;//start traversing at the head 
      
    if(index==0){ // if added to the head go back to orginal add method with one argument
      add(value);
    } else {
      while(index-1 != i){//keep doing this until we get to the node right before where we want to insert
        i++;//increment the counter variable
        walker = walker.getNext();//assign walker to point to the next node 
      }
      brand_new.setNext(walker.getNext()); //sets it to the value of the next node, since we stopped at the node before where we want to insert
      walker.setNext(brand_new); //walker now has the value that brand_new is currently set at 
      //the last item of a linkedlist is always null - therefore adding to end of list is not a special case 
    }
  }
*/

//https://www.javadevjournal.com/data-structure/linked-list/ good resource for understanding linked lists 
