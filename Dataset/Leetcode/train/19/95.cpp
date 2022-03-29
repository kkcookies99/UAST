 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* dummy = head;
        ListNode* first = head;
        ListNode* second =head;
        for (int i = 0; i < n; ++i) {
            first = first->next;
        }
        if(first==nullptr){
            dummy=dummy->next;
            return dummy;
        }
        while (first->next!=nullptr) {
            first = first->next;
            second = second->next;
        }
        second->next = second->next->next;
        return dummy;
    }
};

