class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *h = head, *pre = head;
        if(h==NULL || h->next==NULL) return h;

        pre = pre->next;
        while(pre)
        {
            if(pre->val == h->val)
            {
                h->next = pre->next;
                delete pre;
                pre = h->next;
            }
            else
            {
                h = h->next;
                pre = pre->next;
            }
        }
        return head;
    }
};

