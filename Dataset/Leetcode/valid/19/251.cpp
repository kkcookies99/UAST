 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *p;
        int m=1;
        for(p=head;p->next!=NULL;p=p->next,m++);
        if(m==n)return head->next;
        for(p=head;n<m-1;p=p->next,n++);
        p->next=p->next->next;
        return head;
    }
};

