class Solution {
    ListNode* deleteHelper(ListNode* head, int val) {
        if (head == nullptr) {
            return head;
        }
        if (head->val == val) {
            return deleteHelper(head->next,val);
        }
        head->next = deleteHelper(head->next,head->val);
        return head;
    }
public:
    ListNode* XXX(ListNode* head) {
        if (!head) {
            return head;
        }
        head->next = deleteHelper(head->next,head->val);
        return head;
    }
};

