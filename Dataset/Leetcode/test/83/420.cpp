 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if (!head) return head;
        ListNode *p1 = head, *p2 = head -> next, *temp;
        while (p2) {
            if (p2 -> val == p1 -> val) {
                temp = p2;
                p2 = p2 -> next;
                p1 -> next = p2;
                delete temp;
            }

            else {
                p1 = p2;
                p2 = p2 -> next;
            }
        }
        return head;
    }
};

