class Solution {
public:
    ListNode* XXX(ListNode* head) {
        for (auto p = head; p;) {
            if (p->next && p->val == p->next->val) p->next = p->next->next;
            else p = p->next;
        }

        return head;
    }
};

