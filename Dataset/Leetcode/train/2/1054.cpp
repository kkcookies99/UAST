 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        if (l1==NULL) return l2;
        if (l2==NULL) return l1;
        ListNode* p = l2;
        while(l2->next!=NULL&&l1->next!=NULL)
        {
            l2->val += l1->val;
            if (l2->val>=10)
            {
                l2->next->val+=l2->val/10;
                l2->val%=10;
            }
            l1=l1->next;
            l2=l2->next;
        }
        l2->val+=l1->val;
        if(l2->next==NULL)l2->next=l1->next;
        while(l2->next!=NULL)
        {
            if (l2->val>=10)
            {
                l2->next->val+=l2->val/10;
                l2->val%=10;
            }
            l2=l2->next;
        }
        if (l2->val>=10)
        {
            l2->next = new ListNode(l2->val/10,NULL);
            l2->val%=10;
        }
        return p;
    }
};

