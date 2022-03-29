class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head == NULL)
            return NULL;
        ListNode* cur = head;
        while(cur->next != NULL){
            if(cur->next->val == cur->val)
                cur->next = cur->next->next;
            else
                cur = cur->next;
        }
        return head;
    }
};

