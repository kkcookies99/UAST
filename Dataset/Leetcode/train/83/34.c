struct ListNode* XXX(struct ListNode* head){
    struct ListNode *p = head;
    while(!p->next){
        if(p->next->val==p->val){
            struct ListNode *temp = p->next;
            if(!(p->next->next)){
               p->next = p->next->next; 
            }else{
                p->next = NULL;
            }
            free(temp);
        }else{
            p = p->next;
        }
    }
    return head;
}

