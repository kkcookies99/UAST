 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* dummyHead = new ListNode(0);
        dummyHead->next = head;
        ListNode* fast = dummyHead;
        ListNode* slow = dummyHead;
        while(n-- && fast != NULL) {
            fast = fast->next;
        }
        fast = fast->next;
        while(fast) {
            fast = fast->next;
            slow = slow->next;
        }
        slow->next = slow->next->next;
        // return head;为什么这样写有的样例过不去...
        return dummyHead -> next;
    }
};

