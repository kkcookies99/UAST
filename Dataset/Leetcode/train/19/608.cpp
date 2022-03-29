 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* p[30];
        ListNode* q=head;
        int count=0;
        while(q!=NULL)
        {
            p[count]=q;
            count++;
            q=q->next;
        }
        if(n==count)
            return head->next;
        p[count-n-1]->next=p[count-n-1]->next->next;
        return head;
    }
};

