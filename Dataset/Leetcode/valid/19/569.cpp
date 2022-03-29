 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *p = head, *q = head;
        int len = 0, erase_pos = 0;

        while(p)
        {
            len += 1;
            while(erase_pos < len - n - 1)
            {
                q = q->next;
                erase_pos += 1;
            }
            p = p->next;
        }
        if(n == len)
            head = head->next;
        else
        {
            ListNode *temp = q->next;
            q->next = temp->next;
        }
        return head;
    }
};

