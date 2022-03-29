 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode dummyHead(0);
        dummyHead.next = head;
        ListNode* first = head;
        ListNode* second = &dummyHead;

        for (int i = 0; i < n; ++i) {
            first = first->next;
        }

        while (first) {
            first = first->next;
            second = second->next;
        }
        second->next = second->next->next;
        return dummyHead.next;
    }
};

