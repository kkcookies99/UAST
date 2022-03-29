 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* temp = head;
        while (temp) {
            ListNode* temp1 = temp->next;
            if (temp1) {
                while (temp1->val == temp->val) {
                    temp1 = temp1->next;
                    if (temp1 == NULL)
                        break;
                }
            }
            temp->next = temp1;
            temp = temp1;
        }
        return head;
    }
};

