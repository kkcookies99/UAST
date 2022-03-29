 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        auto dummy = new ListNode(-1);
        dummy->next = head;
        auto p1 = dummy;
        auto p2 = dummy;

        while (n--)
            p2 = p2->next;
        
        while (p2->next != nullptr) {
            p1 = p1->next;
            p2 = p2->next;
        }

        p1->next = p1->next->next;

        return dummy->next;
    }
};

