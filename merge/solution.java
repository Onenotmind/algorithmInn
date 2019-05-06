/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode pHead1,ListNode pHead2) {
       // 两个链表若只有一个链表为空，则返回另一个链表的头指针
        if (pHead1==null) return pHead2;
        else if (pHead2==null) return pHead1;
        else
        {
            ListNode p=pHead1;
            ListNode q=pHead2;
            ListNode tail = null;
            // 判断两个链表的第一个节点大小，决定合并后的链表头指针
            if (p.val < q.val)
            {
                pHead1 = tail = p;
                p = p.next;
            }
            else
            {
                pHead1 = tail = q;
                q = q.next;
            }
            // 当两个链表的节点没全部遍历时
            while(p!=null && q!=null)
            {
              // 当链表1当前节点值小于链表2节点值时，则链表1的当前节点为tail的下一个节点
                if (p.val < q.val) {
                    // tail节点的next指针指向p
                    tail.next = p;
                    // tail指针指向p,其实也是指向tail的下一个节点
                    tail = p;
                    // p指针指向下一个节点
                    p = p.next;
                }else{
                  // 当链表2当前节点值小于链表1节点值时，则链表2的当前节点为tail的下一个节点
                    tail.next = q;
                    tail = q;
                    q = q.next;
                }
            }
            // 若q不为空，即链表2还有节点未遍历，则直接将tail的next指针赋值q
            if (q!=null) tail.next = q;
            // 若p不为空，即链表1还有节点未遍历，则直接将tail的next指针赋值p
            if (p!=null) tail.next = p;
            // 返回pHead1指针，即tail这条链的头指针
            return pHead1;
        }
    }
}