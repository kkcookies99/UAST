 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *root = new ListNode(0, head);
        ListNode *fast = head, *slow = root;
        int cnt = 1;
        while(cnt++<n) fast=fast->next;
        while(fast->next){
            fast =fast->next;
            slow = slow->next;
        }
        slow->next = slow->next->next;
        return root->next;
    }
};

