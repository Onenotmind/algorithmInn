/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        // 链表为空返回null
        if(head==null)
            return null;
        ListNode newHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        //遍历链表的每个节点
        while(pNode!=null){
          // 新建节点，初始化为当前节点的下一个节点
          ListNode pNext = pNode.next;
          if(pNext==null)
              newHead = pNode;
          // 前后节点置换
          pNode.next = pPrev;
          pPrev = pNode;
          pNode = pNext;
        }
        return newHead;
    }
}