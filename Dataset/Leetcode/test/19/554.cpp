 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(head->next == nullptr) return nullptr;
        else if(n == 1) {
            ListNode* p = head;
            while(p->next->next) p = p->next;
            p->next = nullptr;
            return head;
        }
        ListNode* p = head;
        ListNode* q = p;
        int times = n;
        while(--times)
            q = q->next;

        while(q->next) {
            q = q->next;
            p = p->next;
        }
        p->val = p->next->val;
        p->next = p->next->next;
        return head;
    }
};

