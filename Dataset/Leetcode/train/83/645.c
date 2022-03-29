 struct ListNode* XXX(struct ListNode* head){
    if(head==NULL)return NULL;
    struct ListNode *h,*r;
    h=head;
    r=h->next;
    while(r){
        if(r->val!=h->val){
            h->next=r;
            h=r;
        }
        r=r->next;
    }
    if(h->next!=NULL)h->next=NULL;
    return head;
}

