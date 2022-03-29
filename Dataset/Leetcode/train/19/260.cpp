 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        // 双指针
        ListNode* pHead = new ListNode(0,head);
        ListNode* fast = pHead,*slow = pHead;
        n += 1;
        while(n--) fast = fast->next;
        while(fast)
        {
            fast = fast->next;
            slow = slow->next;
        }
        ListNode*t = slow->next;
        slow->next = slow->next->next;
        delete t;
        return pHead->next;
    }
};

