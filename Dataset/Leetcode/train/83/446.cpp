 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if (!head) return nullptr;

        ListNode* p = head;
        while (p) {
            ListNode* curr = p;
            while (p && p->val == curr->val) p = p->next;
            curr->next = p;
        }

        return head;
    }
};

