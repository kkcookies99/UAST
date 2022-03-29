class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==nullptr)return head;
        ListNode* fast=head;ListNode* slow=head;
        fast=fast->next;
        while(fast!=nullptr){
            if(slow->val==fast->val){
                fast=fast->next;
                slow->next=fast;
            }
            else{
                fast=fast->next;
                slow=slow->next;
            }
        }
        return head;
    }
};

