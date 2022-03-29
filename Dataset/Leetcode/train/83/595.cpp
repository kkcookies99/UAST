 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        
        ListNode* temp = head;
        while(temp != NULL)
        {
            while(temp->next != NULL && temp->val == temp->next->val)
            {
                temp->next = temp->next->next;
            }
            temp = temp->next;
        }
        
        return head;
    }
};

