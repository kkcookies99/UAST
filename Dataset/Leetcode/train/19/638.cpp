 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *fast, *low;
        low = fast = head;
        for(int i = 1; i < n; i++)
        {
            fast = fast->next;
        }
        if(fast->next == nullptr)
            return low->next;
        while(fast->next->next)
        {
            fast = fast->next;
            low = low->next;
        }
        low->next = low->next->next;
        return head;
    }
};

