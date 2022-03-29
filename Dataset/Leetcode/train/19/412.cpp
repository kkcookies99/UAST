 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *fast=head;
        ListNode *cur=head;
        ListNode *last=head;
        while(n)
        {
            fast=fast->next;
            n--;
        }
        while(fast)
        {
            last=cur;
            cur=cur->next;
            fast=fast->next;
        }
        if(cur==head)
            return head->next;
        last->next=cur->next;
        return head;
    }
};

