 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *dummy = new ListNode(-1);
        ListNode *last = dummy;
        ListNode *cur = head;
        while(cur != nullptr){
            int curVal = cur->val;      
            while(cur->next != nullptr && cur->next->val == curVal)
                cur = cur->next; 
            last->next = cur;
            last = last->next; 
            cur = cur->next;
        } 
        return dummy->next;
    }
};

