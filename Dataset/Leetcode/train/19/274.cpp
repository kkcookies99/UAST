 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* Fast=head;
        ListNode* Slow=head;

        for(int i=0;i<n;i++)
        {
            Fast=Fast->next;
        }
        if(Fast==0)
        {
            return head->next;
        }
        while(Fast->next!=0)
        {
            Fast=Fast->next;
            Slow=Slow->next;
        }
        Slow->next=Slow->next->next;
        return head;

    }

};

