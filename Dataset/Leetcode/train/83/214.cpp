class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==nullptr||head->next==nullptr) return head;
        ListNode* slow=head;
        ListNode* fast=head->next;
        while(fast!=nullptr)
        {
            while(fast!=nullptr&&fast->val==slow->val) fast=fast->next;
            slow->next=fast;
            slow=slow->next;
        }
        return head;
    }
};

