struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
    struct ListNode *result=(struct ListNode *)malloc(sizeof(struct ListNode));
    struct ListNode *head=result;
    int flag=1;
    int k=0;
    while(flag)
    {
        int max=l1->val+l2->val+k;
        struct ListNode *p=(struct ListNode *)malloc(sizeof(struct ListNode));
        p->next=NULL;
        p->val=max%10;
        result->next=p;
        result=result->next;
        k=max/10;
        if(l1->next==NULL&&l2->next==NULL)
        {
            flag=0;
            if(k!=0)
            {
                struct ListNode *q=(struct ListNode *)malloc(sizeof(struct ListNode));
                q->next=NULL;
                q->val=k;
                result->next=q;
            }
        }
        if(l1->next!=NULL)
        {
            l1=l1->next;
        }
        else
        {
            l1->val=0;
        }
        if(l2->next!=NULL)
        {
            l2=l2->next;
        }
        else
        {
            l2->val=0;
        }
    }
    return head->next;
}

