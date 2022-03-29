class Solution {
public:
    ListNode* XXX(ListNode* head) {
       if(head == NULL || head->next == NULL)
            return head;
        ListNode* tmp = head;
        while (head->next != NULL) {
            if (head->val == head->next->val)
                head->next = head->next->next;
            else
                head = head->next;
        }
        return tmp;
    }
};

