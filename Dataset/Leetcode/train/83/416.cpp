 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if (head == NULL)
            return 0;

        if (head -> next == NULL)
            return head;

        ListNode* p = head;
        
        while (p != NULL) {
            if (p -> next != NULL && p -> val == p -> next -> val) {
                ListNode* q = p -> next;
                p -> next = q -> next;
                delete(q);
            }
            else
                p = p -> next;
        }
        delete(p);
        return head;
    }
};

