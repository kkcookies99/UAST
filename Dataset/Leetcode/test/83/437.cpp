 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode*p=head;
        ListNode*q=head;
        ListNode*q_pre=q;
        if(head==NULL) return head;
        for(;q;q=q->next){
            if(q->val!=q_pre->val)
                {p->next=q;p=p->next;}
            q_pre=q;
        }
        p->next=NULL;
        return head;
    }
};

