/** Stack abstract data type */
public class Stack<T> {
  /** List objects to hold our stack items.
      Use List operations to implement the methods below */
  private List<T> list;

  public Stack() {
    // instantiate list here
    list = new List<T>();

  }

  public void push(T value) {
    //prepend list
    list.prepend(value);

  }

  public T pop() {
    // pop the top
    T value = list.getValueAt(0);
    list.deleteAt(0);
    return value;
  }

  public T peek() {
    // returns top of stack
    return list.getValueAt(0);

  }

  public boolean isEmpty() {
    //if the Queue is empty, returns true otherwise returns false
    if (list.size() == 0){return true;}
    else{return false;}

  }
}
