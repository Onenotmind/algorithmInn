// 链表类
class LinkList
{
  class Node
  {
    int data; // 数据域
    Node next; // 指针域
  }
 
  public Node first; // 头结点
  public Node r; // 尾结点
 
  public LinkList() // 构造函数
  {
    this.first = new Node();
    r = first;
  }
 
  // 头插法建表
  public void addFirstNode(int data) {
    Node s = new Node(); // 创建新结点
    s.data = data;
    s.next = first.next; // 将node插在原开始结点之前，头结点之后!!!
    first.next = s;
  }

  // 尾插法建表
  public void addLastNode(int data) {
    Node s = new Node(); // 创建新结点
    s.data = data;
    r.next = s;
    r = s;
  }

  // 查找链表中的第k个节点
  public Node findKNode (int k) {
    ListNode p = first;
    for (int i = 0; i < count - k; i++) {
      p = p.next;
    }
    return p
  }

  // 查找链表中的倒数第k个节点
  public ListNode FindKthToTail(int k) {
    if (first == null)   return first;
    ListNode node = first;
    int count = 0;
    // 获取链表的长度
    while (node != null) {
      count++;
      node = node.next;
    }
    if (count < k)  return null;

    ListNode p = first;
    for (int i = 0; i < count - k; i++) {
      p = p.next;
    } 
    return p;
  }
}
