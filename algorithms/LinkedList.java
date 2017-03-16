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
