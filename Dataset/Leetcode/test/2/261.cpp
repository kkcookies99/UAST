class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode *p = l1,*pre = new ListNode(0),*t;
        pre->next = l1;
        int r = 0;
        while(l1 != NULL && l2!= NULL){
            l1->val += r;
            r = (l1->val + l2->val) / 10;
            l1->val = (l1->val + l2->val)%10;
            pre = l1;
            l1 = l1->next;
            l2 = l2->next;
        }
        if(l1 == NULL && l2 != NULL)
            pre->next = l2;
        l1 = pre->next;
        while( l1 != NULL && r==1)
        {
            l1->val+=r;
            r = l1->val /10;
            l1->val %= 10;
            pre = l1;
            l1 = l1->next;
        }
        if(r == 1){
            ListNode *q = new ListNode(1);
            pre->next = q;
        }
        return p;
    }
};

