 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if (head == NULL || head->next == NULL) {
            return head;
        }
        ListNode* start = head;
        while (head != NULL && head->next != NULL) {
            if (head->val == head->next->val) {
                ListNode* tmp = head->next;
                head->next = head->next->next;
                delete tmp;
                tmp = NULL;
            } else {
                head = head->next;
            }
        }
        return start;
    }
};

