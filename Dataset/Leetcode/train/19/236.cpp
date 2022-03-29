 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        auto p = head;
        while (n--) p = p->next; 
        if (!p) return head->next;
        auto q = head;
        while (p->next) {
            p = p->next;
            q = q->next;
        }
        q->next = q->next->next; 
        return head;
    }
};

