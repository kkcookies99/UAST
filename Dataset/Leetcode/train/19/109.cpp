 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* pslow=head;
        ListNode* pfast=head;
        ListNode* pre=NULL;
        if(head->next==NULL&&n!=0) return NULL;
        while(--n)
            pfast=pfast->next;
        while(pfast->next!=NULL)
        {
            pre=pslow;
            pfast=pfast->next;
            pslow=pslow->next;
        }
        if(pre!=NULL) pre->next=pslow->next;
        if(pslow==head)
            return head->next;
        pslow->next=NULL;
        return head;
    }
};

