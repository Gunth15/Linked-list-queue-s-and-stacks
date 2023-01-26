/** Linked List implementation of our List abstract data type */
public class List<T> {
  // put all fields from ListAsLinkedList class here
  private Node<T> head;
  private Node<T> tail;
  private int index = 0;
  
  // put all methods from ListAsLinkedList class here
  public List(){head = tail = null;}
  public void append(T value){

    if(this.index == 0){

      Node<T> cur = new Node<T>(value);
      this.head = this.tail = cur;
      this.head.setNext(tail);

    }
    else{

      Node<T> temp = this.head;
      Node<T> nxtLink = new Node<T>(value);
      for(int i = 1; i < index; i++) {temp = temp.getNext();}
      temp.setNext(nxtLink);
      this.tail = nxtLink;

      }

      index++;

  } 

  public void prepend(T value){

    Node<T> cur = this.head;
    this.head = new Node<T>(value);
    this.head.setNext(cur);
    index++;

  } 

  public void deleteAt(int position){

    Node<T> nxt;
    if(position-1 == -1){

      nxt = this.head.getNext();
      this.head = nxt;
      
    }
    else{

      Node<T> prev = this.head;
      for(int i = 0; i < position-1;i++) {prev = prev.getNext();}
      if(position == this.index){

        this.tail = prev;       
        nxt = null;

      }
      else{

        nxt = prev.getNext().getNext();
      }

      prev.setNext(nxt);

    }
    index--;
  }

  public T getValueAt(int position){

    Node<T> temp = this.head;

    if(position == 0) {return temp.getData();}

    for(int i = 0;i < (position);i++) {temp = temp.getNext();}

    return temp.getData();
  }

  public int positionOf(T value){

    Node<T> cur = this.head;
    for(int i = 0;i < this.index;i++){

      if((cur.getData()) == value) {return i;}
      cur = cur.getNext();

    }

    return -1;
  }

  public int size() {return this.index;}
}

/** A linked list node for our linked list */
class Node<T> {
  // put all fields from Node class here
  private T data;
  private Node<T> next;
  
  // put all methods from Node class here
  public Node(T data){

    this.data = data;
    this.next = null;

  }
  //accesors
  public T getData() {return this.data;}
  public Node<T> getNext() {return this.next;}
  //mutators
  public void setData(T data) {this.data = data;}
  public void setNext(Node<T> next) {this.next = next;}
}