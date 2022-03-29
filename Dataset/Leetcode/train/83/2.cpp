class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *pi = head;
        while (pi && pi->next) {
            if (pi->val == pi->next->val) {
                ListNode *del = pi->next;
                pi->next = pi->next->next;
                delete del;
            } else {
                pi = pi->next;
            }
        }
        return head;
    }
};

