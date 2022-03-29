 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==nullptr || head->next==nullptr) return head;
        if(head->val==head->next->val) {
            head->next=head->next->next;
            return XXX(head);
        }else{
            head->next=XXX(head->next);
            return head;
        }
    }
};

