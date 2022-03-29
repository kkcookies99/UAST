 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode*front=head,*a,*tail=new ListNode(0,head);
        a=tail;
        for(int i=1;front->next!=nullptr;i++,front=front->next)
            if(i>=n)
                tail=tail->next;
        tail->next=tail->next->next;
        return a->next;
    }
};

