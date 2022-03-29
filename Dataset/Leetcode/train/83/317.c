struct ListNode* XXX(struct ListNode* head){
    struct ListNode* tail =head;
    struct ListNode *carry;
    int i,t=-200;
    while(tail!=NULL&&tail->next!=NULL){
        if(tail->val==t){
            tail->val=tail->next->val;
            tail->next=tail->next->next;
        }
        else {
            carry=tail;
            t=tail->val;
            tail=tail->next;
        }
    }
    if(tail!=NULL&&tail->val==t) carry->next=NULL;
    return head;
}

