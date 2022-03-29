 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if (head == NULL) return NULL;
        set<int> values;
        ListNode * front, * rear;
        rear = head;
        while (rear) {
            if (values.count(rear->val)) {
                front->next = rear->next;
                rear = front->next;
            } else {
                values.insert(rear->val);
                front = rear;
                rear = rear->next;
            }
        }
        return head;
    }
};

