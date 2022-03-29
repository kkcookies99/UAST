 struct ListNode* XXX(struct ListNode* head, int n){
    struct ListNode *res=head;
    int pos=0;
    while(res!=NULL)
    {
        res=res->next;
        pos++;
    }   
    pos=pos-n-1;
    if(pos==-1)
    head=head->next;
    else{
    struct ListNode *res2=head; 
    while(pos--)
    {
        res2=res2->next;
    }
    res2->next=res2->next->next;}
    return head;
}

