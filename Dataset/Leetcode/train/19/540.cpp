 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* p=head;
        ListNode* slow=head;
        ListNode* ans=slow;
        ListNode* fast;
        int i=0;
        while(i<n){
            fast=p->next;
            p=p->next;
            i++;
        }
        if(!fast) return head->next;
        while(fast->next){
            slow=slow->next;
            fast=fast->next;
        }
        slow->next=slow->next->next;
        return ans;
    }
};

