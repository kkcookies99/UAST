class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *p=head;
        while(p&&p->next)
        {
            while(p->next&&p->val==p->next->val)
                p->next=p->next->next;
            p=p->next;
        }
        return head;
    }
};

