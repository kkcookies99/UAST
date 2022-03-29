 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) 
    {
        ListNode *res=new ListNode(-1);
        ListNode *p=res;
        int carry=0;
        while(l1||l2||carry)
        {
            int a=l1?l1->val:0;
            int b=l2?l2->val:0;
            p->next=new ListNode((a+b+carry)%10);
            carry=(a+b+carry)/10;
            if(l1)  l1=l1->next;
            if(l2)  l2=l2->next;
            p=p->next;
        }
        return res->next;
    }
};

