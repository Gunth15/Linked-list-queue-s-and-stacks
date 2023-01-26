/** Queue abstract data type */
public class Queue<T> {
  /** List objects to hold our queue items.
      Use List operations to implement the methods below */
  private List<T> list;
  
  public Queue() {
    //instantiate list here
    list = new List<T>();
  }
  
  public void enqueue(T value) {
    //append list
    list.append(value);
  }
  
  public T dequeue() {
    //delete and returbs item from first position of list
    T value = list.getValueAt(0);
    list.deleteAt(0);
    return value;
  }

  public T front() {
    //return the first item in the Queue
    return list.getValueAt(0);
  }
  public void reverse(){
    //stack for conversion
    Stack<T> stack = new Stack<T>();
    //reverses the queue by putting everything in a stack and then pushing in back into a queue
    while(isEmpty() != true){
      stack.push(dequeue());
    }
    while(stack.isEmpty() != true){
      enqueue(stack.pop());
    }
  }
  public boolean isEmpty() {
    //if the Queue is empty, returns true otherwise returns false
    if (list.size() == 0){return true;}
    else{return false;}
  }
}
