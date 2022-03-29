 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *p,*q;
        int x=n;
        q=head;
        p=head;
        while(x>=1&&q->next!=NULL){
            q=q->next;
            x--;
        }
        if(x>=1){
            head=head->next;
            return head;
        }else{
            while(q->next!=NULL){
                q=q->next;
                p=p->next;   
            }
        }
        p->next=p->next->next;
        return head;
    }
};

