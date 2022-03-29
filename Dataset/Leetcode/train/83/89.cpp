class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *pre = new ListNode(0);
        pre->next = head;
        ListNode * res = pre;
        ListNode *cur = head;
        while (cur != NULL && cur->next != NULL) {
            while (cur->next != NULL && cur->val == cur->next->val) {
                cur = cur->next;
            } 
            pre->next = cur;
            pre = cur;
            cur = cur->next;
        }
        return res->next;
    }
};

