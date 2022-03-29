 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==NULL) return NULL;
        ListNode H(-1), *p;
        for(H.next=head, p=head->next; p; p=p->next)
            if(head->val!=p->val) head=p;
            else head->next=p->next;
        return H.next;
    }
};

