 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* first = head;
        ListNode* second = nullptr;
        int i = 0;

        while (first) {
            if (i == n) {
                second = head;
            } else {
                second = second ? second->next : nullptr;
            }
            ++i;
            first = first->next;
        }

        if (second) {
            second->next = second->next->next;
            return head;
        }

        return head->next;
    }
};

