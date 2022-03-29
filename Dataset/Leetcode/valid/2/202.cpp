class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        return add(l1, l2, false);
    }

    ListNode* add(ListNode* l1, ListNode* l2, bool carry)
    {
        if (l1 == NULL && l2 == NULL && !carry)
            return NULL;

        int lval = l1 == NULL ? 0 : l1->val;
        int rval = l2 == NULL ? 0 : l2->val;
        int sum = lval + rval + (carry ? 1 : 0);
        ListNode* cur = new ListNode(sum % 10);
        cur->next = add(l1 == NULL ? NULL : l1->next, l2 == NULL ? NULL : l2->next, sum >= 10);
        return cur;
    }
};

