 class Solution {
public:
    ListNode* XXX(ListNode* head, int n)
    {
        //设置一个dummy 节点： 防止删除的是头节点
        ListNode* dummy = new ListNode(0,head);
        ListNode* slowPtr = dummy;
        ListNode* fasrPtr = dummy;
        ListNode* slowPre = dummy;
        while(n-- > 0)//快指针先从 dummy 开始，走 n 步后 停下
        {
            fasrPtr = fasrPtr->next;
        }
        //快慢指针同时走，快指针停下时，慢指针正好指向要被删除的节点，slowPre 记录慢指针前面的节点
        while(fasrPtr)
        {
            slowPre = slowPtr;
            slowPtr = slowPtr->next;
            fasrPtr = fasrPtr->next;
        }
        slowPre->next = slowPtr->next;
        delete slowPtr;
        ListNode* ansPtr = dummy->next;
        delete dummy;
        return ansPtr;
    }
};

