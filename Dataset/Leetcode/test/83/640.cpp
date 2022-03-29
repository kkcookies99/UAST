 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==NULL||head->next==NULL) return head;
        ListNode*p1=head,*p2=head->next;
        while(p2!=NULL){
            if(p1->val!=p2->val){
                p1->next=p2;
                p1=p2;
            }
            p2=p2->next;
        }
        p1->next=NULL;
        return head;
    }
};

