 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* save = head;

        if(head == nullptr) {
            return head;
        }
        if(head->next == nullptr) {
            return head->next;
        }

        stack<ListNode*> s;
        while(head != nullptr) {
            s.push(head);
            head = head->next;
        }

        ListNode* temp;
        for(int i = 1; i <= n + 1; i++) {
            temp = s.top();
            s.pop();
        }
        ListNode* after = temp->next->next;
        temp->next = after;
        return save;
    }
};

