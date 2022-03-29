 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        ListNode*cur = head;
        while(cur&&cur->next){
            if(cur->next->val == cur->val){
                cur->next = cur->next->next;
            }
            else
                cur = cur->next;
        }
        return dummy->next;
    }
};

