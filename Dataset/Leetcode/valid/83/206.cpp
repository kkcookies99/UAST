class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head == nullptr || head->next == nullptr)
            return head;
        
        if(head->val != head->next->val)
            head->next = XXX(head->next);
        else
        {
            ListNode *move = head->next;
            while(move && head->val == move->val)
                move = move->next;
            
            head->next = XXX(move);
        }
        
        return head;
    }
};

