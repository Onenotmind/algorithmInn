/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
      // 两个链表都不为空
      if(pHead1==null||pHead2==null){
            return null;
        }
      // 当链表头指针一样时，说明是同一个链表
      if(pHead1==pHead2){
          return pHead1;
      }
      // 记录两个链表的长度
      int len1=0;
      int len2=0;
      ListNode curr1=pHead1;
      ListNode curr2=pHead2;
      // 计算得出两个链表的长度
      while(curr1!=null){
          len1++;
          curr1=curr1.next;
      }
      while(curr2!=null){
          len2++;
          curr2=curr2.next;
      }
      curr1=pHead1;
      curr2=pHead2;
      // 当链表1长度大于链表2时，先让链表1走完差值大小的长度
      if(len1>len2){
          int moreLen=len1-len2;
          while(moreLen!=0){
              curr1=curr1.next;
              moreLen--;
          }
      }
      else{
        // 同理，当链表2长度大于链表1时，先让链表2走完差值大小的长度
          int moreLen=len2-len1;
          while(moreLen!=0){
              curr2=curr2.next;
              moreLen--;
          }
      }
      // 此时，判断两条链表剩余节点是否一致
      while(curr1!=curr2&&curr1!=null){
          curr1=curr1.next;
          curr2=curr2.next;
      }
        
      return curr1;
  }
}