 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* dummy=new ListNode();
        dummy->next=head;
        ListNode* pre=dummy,*fast=dummy;
        int step=0;
        while(fast){
            if(step>n){
                pre=pre->next;
            }
            fast=fast->next;
            step++;
        }
        pre->next=pre->next->next;
        return dummy->next;
    }
};

