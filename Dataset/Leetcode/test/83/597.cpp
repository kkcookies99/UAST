 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head)
            return head;
        ListNode* cur=head->next,*pre=head;
        while(cur)
        {
            if(pre->val==cur->val)
            {
                pre->next=cur->next;
                cur=cur->next;
            }
            else
            {
                pre=cur;
                cur=cur->next;
            }
        }
        return head;
    }
};

