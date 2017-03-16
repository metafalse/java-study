public class Main {
  public static void main(String[] args) throws Exception {
    Node node = new Node(6);
    node.appendToTail(7);
    node.appendToTail(8);
    node.deleteNode(node, 7);

    while (node != null) {
      System.out.println(node.data);
      node = node.next;
    }
    
    Stack stack = new Stack();
    stack.push(new Integer(2));
    stack.push(new Integer(3));
    stack.push(new Integer(4));
    
    Object popped = stack.pop();
    while (popped != null) {
      System.out.println(popped);
      popped = stack.pop();
    }
  }
}

class Node {
  Node next = null;
  int data;
  
  public Node(int d) {
    data = d;
  }
  
  void appendToTail(int d) {
    Node end = new Node(d);
    Node n = this;
    while (n.next != null)
      n = n.next;
    n.next = end;
  }

  Node deleteNode(Node head, int d) {
    Node n = head;

    if (n.data == d)
      return head.next;

    while (n.next != null) {
      if (n.next.data == d) {
        n.next = n.next.next;
        return head;
      }
      n = n.next;
    }
    return head;
  }
}

class Stack {
  Node top;
  
  Object pop() {
    if (top != null) {
      Object item = top.data;
      top = top.next;
      return item;
    }
    return null;
  }
  
  void push(Object item) {
    Node t = new Node((int)item);
    t.next = top;
    top = t;
  }
  
  Object peek() {
    return top.data;
  }
}
