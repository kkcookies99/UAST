class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head == nullptr) return head;
        if(head->next == nullptr) return head;

        if(head->val == head->next->val) {
            head->next = head->next->next;
            XXX(head);
        }
        else {
            XXX(head->next);
        }
      

        return head;
    }
};

