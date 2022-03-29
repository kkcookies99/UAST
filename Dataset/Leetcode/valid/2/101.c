struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
    if(l1==NULL){return l2;}
    if(l2==NULL){return l1;}
    
    l1->val=l1->val+l2->val;
    jinwei(l1);
    l1->next=XXX(l1->next,l2->next);
    return l1;
        }

void jinwei(struct ListNode* l1){
    if(l1->val>9){
        if(l1->next==NULL){
            struct ListNode* p=NULL;
            p=malloc(sizeof(struct ListNode));
            p->val=l1->val/10;
            p->next=NULL;
            l1->next=p;

        }else{
            l1->next->val+=l1->val/10;
            jinwei(l1->next);
        }
        l1->val%=10;
    }
}

