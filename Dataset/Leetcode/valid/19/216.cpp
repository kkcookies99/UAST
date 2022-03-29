 class Solution {
public:
    ListNode* XXX(ListNode* head, int n)
    {
        static int m=n;
        if(!head)return 0;
        XXX(head->next,m);
        if(m==0)
        {
            head->next=head->next->next;
        }
        m--;
        if(m==0)
        return head->next;
        return head;
    }
};

