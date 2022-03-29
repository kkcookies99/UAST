 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* quick=head;
        ListNode* slow=head;
        while(quick)
        {
            quick=quick->next;
            n--;
            if(n+1<0)
            {
                slow=slow->next;
            }
        }
        if(n==0) return head->next;
        slow->next=slow->next->next;
        return head;
    }
};

