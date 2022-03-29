 class Solution {
public:
    ListNode *XXX(ListNode *l1, ListNode *l2) {
        int temp = 0, count = 0;
        ListNode *p = l1, *q = l2;
        ListNode *h = new ListNode();
        h->next = p;
        while (p != nullptr && q != nullptr) {
            temp = p->val + q->val + count;
            count = temp / 10;
            temp %= 10;
            p->val = temp;
            p = p->next;
            q = q->next;
            h = h->next;
        }
        p = p == nullptr ? q : p;
        h->next = p;
        if (count != 0) {
            if (p == nullptr) {
                h->next = new ListNode(count);
            } else {
                while (p != nullptr && count != 0) {
                    temp = p->val + count;
                    count = temp / 10;
                    temp %= 10;
                    p->val = temp;
                    p = p->next;
                    h = h->next;
                }
                if (p == nullptr && count != 0) {
                    h->next = new ListNode(count);
                }
            }
        }
        return l1;
    }
};

