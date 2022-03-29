 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* res=head;
        ListNode* fast=head;
        ListNode* slow=head;
        while(n){
            fast=fast->next;
            n--;
        }
        if(!fast)
            return res->next;
        while(fast->next){
            fast=fast->next;
            slow=slow->next;
        }
        slow->next=slow->next->next;
        return res;
    }
};

