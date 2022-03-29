class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode* res = new ListNode(0);
        ListNode* cur = res;
        int flag = 0;
        while (l1 || l2 || flag)
        {
            int val1 = l1 ? l1->val : 0;
            int val2 = l2 ? l2->val : 0;
            int num = val1 + val2 + flag;
            flag = num / 10;
            num = num % 10;
            cur->next = new ListNode(num);
            cur = cur->next;
            l1 = l1 ? l1->next : l1;
            l2 = l2 ? l2->next : l2;
        }
        return res->next;
    }
};

