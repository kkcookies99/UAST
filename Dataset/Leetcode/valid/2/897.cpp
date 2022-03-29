 class Solution {
public:
ListNode* XXX(ListNode* l1, ListNode* l2)
{
    ListNode* head=new ListNode();
    int r=0;
    ListNode* temp=head;
    while(l1||l2||r)
    {
        if(l1)
        {
            r+=l1->val;
            l1=l1->next;
        }
        if(l2)
        {
            r+=l2->val;
            l2=l2->next;
        }
        temp->next=new ListNode(r%10);
        temp=temp->next;
        r/=10;
    }
    return head->next;
}
};

