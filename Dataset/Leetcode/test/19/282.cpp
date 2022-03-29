 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        stack <ListNode*> s;
        ListNode* begin = head;

        if (begin->next == nullptr) {
            head = nullptr;
            return head;
        }

        while (begin != nullptr) {
            s.push(begin);
            begin = begin->next;
        }

        for (int i=0; i<n; i++) {
            s.pop();
        }

        if (s.empty()) {
            return head->next;
        }
        begin = s.top();
        begin->next = begin->next->next;

        return head;
    }
};

