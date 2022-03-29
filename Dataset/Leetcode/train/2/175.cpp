class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode *r = nullptr, *ptr = nullptr;
        int s, c = 0;

        while(l1 || l2 || c) {
            int n1 = l1 ? l1->val : 0;
            int n2 = l2 ? l2->val : 0;
            s = n1 + n2 + c;
            c = s / 10;

            if(!r) {
                r = new ListNode(s % 10);
                ptr = r;
            }
            else {
                ptr->next = new ListNode(s % 10);
                ptr = ptr->next;
            }

            l1 = l1 ? l1->next : nullptr;
            l2 = l2 ? l2->next : nullptr;
        } 
        if(c) {
            ptr->next = new ListNode(c);
        }
        return r;
    }
};

