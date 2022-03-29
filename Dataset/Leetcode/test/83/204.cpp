class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode * head1 = head,* q = NULL,*p = head1;
        while(p)
        {
            q = p -> next;
            while(q && p -> val == q -> val)
                q = q -> next;            
            p -> next = q;
            p = p -> next;
        }
        return head1;
    }
};

