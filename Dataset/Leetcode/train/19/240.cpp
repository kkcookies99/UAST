 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(head == nullptr || head -> next == nullptr)
            return nullptr;
        ListNode *res = head, *slow = head, *fast = head;
        while(--n)
            fast = fast -> next;
        ListNode *pre = slow;
        while(fast -> next)
        {
            pre = slow;
            fast = fast -> next;
            slow = slow -> next;
        }
        while(slow -> next)
        {
            slow -> val = slow -> next -> val;
            pre = slow;
            slow = slow -> next;
        }
        pre -> next = nullptr;
        return res;
    }
};

