class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head || !head->next)return head;
        head->next = XXX(head->next);
        return head->val==head->next->val? head->next: head;
    }
};

