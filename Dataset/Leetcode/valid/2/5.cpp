class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        auto dummy = new ListNode(-1), p = dummy;
        int t = 0;
        while (l1 || l2 || t)
        {
            if (l1) t += l1->val, l1 = l1->next;
            if (l2) t += l2->val, l2 = l2->next;
            p->next = new ListNode(t%10);
            p = p->next;
            t /= 10;
        }
        return dummy->next; 
    }
};

