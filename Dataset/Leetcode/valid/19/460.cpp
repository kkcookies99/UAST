 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *cur = head,*forward = head,*pre = nullptr;
        while (n--) {
            forward = forward->next;
        }
        while (forward != nullptr) {
            pre = cur;
            cur = cur->next;       
            forward = forward->next;
        }
        if (pre) {
            pre->next = pre->next->next;
        }
        return pre ? head : head->next;
    }
};

