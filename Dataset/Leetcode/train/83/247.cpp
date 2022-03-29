class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head||!head->next)
            return head;
        ListNode* pre = head;
        ListNode* cur = head->next;
        while(cur){
            if(pre->val==cur->val)
                pre->next = cur->next;
            else
                pre = cur;
            cur = cur->next;
        }  
        return head;
    }
};

