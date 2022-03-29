 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* dummy=new ListNode(0);
        dummy->next=head;
        ListNode* first=dummy;
        ListNode* second=dummy;
        for(int i=1;i<=n+1;i++)
            first=first->next;
        while(first!=NULL){
            first=first->next;
            second=second->next;
        }
        second->next=second->next->next;
        return dummy->next;
    }
};

