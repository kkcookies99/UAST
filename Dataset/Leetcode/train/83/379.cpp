class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* p=head;
        if(head == NULL) return head;  //空链表特判
        while(p->next) {  //遍历删除重复结点
            if(p->val == p->next->val) p->next = p->next->next;  //重复删除
            else p = p->next;  //不重复前进一位
        }
        return head;
    }
};

