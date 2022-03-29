class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int cur = 0;
        ListNode *first = NULL;
        ListNode *last = NULL;
        while (l1!=NULL||l2!=NULL||cur!=0)
        {
            if (l1!=NULL)
            {
                cur += l1->val;
                l1 = l1->next;
            }
            if (l2!=NULL)
            {
                cur += l2->val;
                l2 = l2->next;
            }
            ListNode *oldlast = last;
            last = new ListNode(cur % 10);
            cur /= 10;
            if (first == NULL)
                first = last;
            else
                oldlast->next = last;
        }
        return first;
    }
};

