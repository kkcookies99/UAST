 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *dummy = new ListNode(0);
        dummy->next = head;
        ListNode *fast = head, *slow = dummy;
        int i;
        for(i = 0;i<n;i++)
            fast = fast->next;
        while(fast){
            fast = fast->next;
            slow = slow->next;
        }
        slow->next = slow->next->next;
        return dummy->next;
    }
};

