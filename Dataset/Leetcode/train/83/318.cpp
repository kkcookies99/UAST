class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* h = head;
        while(head && head->next)
        {
            if(head->val==head->next->val)
            {
                head->next = head->next->next;
            }
            else
            {
                head = head->next;
            }
        }
        return h;
    }
};

