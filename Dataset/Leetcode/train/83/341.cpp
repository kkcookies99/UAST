class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head)
            return head;
        ListNode *p = head;
        ListNode *last_num = p;
        p = p->next;
        while(p)
        {
            if(p->val == last_num->val)
            {
                last_num->next = p->next;
                p = p->next;
            }
            else
            {
                p=p->next;
                last_num = last_num->next;
            }
        }
        return head;
    }
};

