 struct ListNode* XXX(struct ListNode* head, int n){
    struct ListNode*p=head;
    struct ListNode* a[100];
    int i=0;
    while(p!=NULL){
        a[i]=p;
        ++i;
        p=p->next;
    }
    i=i-n;
    if(i==0){
        return head->next;
    }else{
        a[i-1]->next=a[i]->next;
        return head;
    }
}

