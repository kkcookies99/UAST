 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *p = head, *q = head;
        while(q != NULL) {
            while(q != NULL && p->val == q->val) {
                q = q->next;
            }
            if(p->next != q) {// 发生重复
                p->next = q;
            }
            p = q;
        }
        return head;
    }
};

