/*
struct ListNode {
    int val;
    struct ListNode *next;
    ListNode(int x) :
            val(x), next(NULL) {
    }
};*/
class Solution {
public:
    ListNode* ReverseList(ListNode* head) {
      // 链表为空返回null
        if(head==NULL)
            return NULL;
        ListNode *newHead = NULL;
        ListNode *pNode = head;
        ListNode *pPrev = NULL;
        //遍历链表的每个节点
        while(pNode!=NULL){
          // 新建节点，初始化为当前节点的下一个节点
          ListNode *pNext = pNode->next;
          if(pNext==NULL)
              newHead = pNode;
          // 前后节点置换
          pNode->next = pPrev;
          pPrev = pNode;
          pNode = pNext;
        }
        return newHead;
    }
};