 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int book = 0;
        ListNode* ans;
        ListNode head(0);
        ans = &head;
        while(l1 || l2)
        {
            if(l1)
                book += l1->val,l1 = l1->next;
            if(l2)
                book += l2->val,l2 = l2->next;
            ans->next = new ListNode(book % 10);
            book /= 10;
            ans = ans->next;
        }
        if(book)
            ans->next = new ListNode(1);
        return head.next;
    }
};

