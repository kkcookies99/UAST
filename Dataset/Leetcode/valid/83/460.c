 struct ListNode* XXX(struct ListNode* head){
    if(!head)   return head;
    struct ListNode *rear = head;
    struct ListNode *prior = rear->next;
    struct ListNode *del;
    while(rear->next){
        if(prior->val == rear->val){
            del = prior;
            prior = prior->next;
            rear->next = prior;
            free(del);
            del = NULL;
        }
        else{
            rear = prior;
            prior = prior->next;     
        }
    }
    return head;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


