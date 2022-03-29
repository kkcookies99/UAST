class Solution {
    int a=0;
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        if(!l1&&!l2)return a==0?nullptr:new ListNode(1);
        if(l1)a+=l1->val;
        if(l2)a+=l2->val;
        if(!l1)swap(l1,l2);
        l1->val=a%10;
        a/=10;
        l1->next=XXX(l1->next,l2?l2->next:l2);
        return l1;
    }
};

