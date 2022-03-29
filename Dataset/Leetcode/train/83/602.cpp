 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *p = head;
        while (p) {
            if (p->next && p->val == p->next->val) p->next = p->next->next;
            else p = p->next;
        }
        return head;
    }
};

