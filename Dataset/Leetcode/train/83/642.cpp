 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==NULL||head->next==NULL) return head;
        ListNode *nx=head->next,*t=head;
        int ls=head->val;
        while(nx!=NULL){
            if(ls!=nx->val){
                t->next=nx;
                t=t->next;
                ls=nx->val;
            }
            nx=nx->next;
        }
        t->next=NULL;
        return head;
    }
};

