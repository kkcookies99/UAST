 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *p = head;
        while (n--) p = p->next;
        if (p == nullptr) return head->next;

        ListNode *prevNode = head;
        while (p = p->next) prevNode = prevNode->next;
        prevNode->next = prevNode->next->next;
        return head;
    }
};

