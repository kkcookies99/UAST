 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* res = head;
        while (res != NULL && res->next != NULL)
        {
            if (res->val == res->next->val) {
                res->next = res->next->next;
            }
            else
            {
                res = res->next;
            } 
        }
        return head;
        
    }
};

