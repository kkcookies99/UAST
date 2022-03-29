class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int carry=0;
        int sum=0;
        ListNode* newhead=new ListNode(0,nullptr);
        ListNode* nownode=newhead;
        while(l1||l2||carry)
        {
            sum=(l1?l1->val:0)+(l2?l2->val:0)+carry;
            carry=sum/10;
            ListNode* node=new ListNode(sum%10,nullptr);
            nownode->next=node;
            nownode=nownode->next;

            l1=l1?l1->next:l1;
            l2=l2?l2->next:l2;
        }
        
        return newhead->next;
    }
};

