struct ListNode* XXX(struct ListNode* head){
     struct ListNode*p=head,*del;
     while(p!=NULL&&p->next!=NULL)
     {
         if(p->val==p->next->val)
         {
             del=p->next;
             p->next=p->next->next;
             free(del);
         }
         else
         {
             p=p->next;
         }
     }
     return head;
}

