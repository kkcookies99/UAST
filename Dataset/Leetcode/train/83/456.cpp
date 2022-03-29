 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head) return nullptr;
        ListNode* pi = head;
        while(pi) {
            while(pi->next && pi->next->val == pi->val) pi->next = pi->next->next;
            pi = pi->next;
        }
        return head;
    }
};

