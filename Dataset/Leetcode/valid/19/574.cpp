 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *front = head, *tail = head;
        for (int i = 0; i < n; i++) tail = tail->next;
        if(tail)
        while(tail->next) {
            front = front->next;
            tail = tail->next;
        }
        else return front->next;
        front->next = front->next->next;
        return head;
    }
};

