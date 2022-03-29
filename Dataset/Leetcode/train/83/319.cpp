class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *p=head;
        ListNode *q;
        while(p!=nullptr)
        {
            q=p->next;
            while(q!=nullptr&&q->val==p->val)
            {
                q=q->next;
            }
            if(q==nullptr)
            {
                p->next=nullptr;
                break;
            }
            p->next=q;
            p=p->next;
        }
        return head;
    }
};

