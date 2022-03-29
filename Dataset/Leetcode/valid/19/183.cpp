 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *p=head;
        stack<ListNode*> s;
        while(p!=NULL) {
            s.push(p);
            p=p->next;
        }
        for(int i=0;i<n;i++) s.pop();
        if(s.empty())  head=head->next;
        else{
            p=s.top();
            //s.pop();
            p->next=p->next->next;
        }
        return head;
    }
};

