 struct ListNode* XXX(struct ListNode* head, int n){
    if(head==NULL){
        return head;
    }
    struct ListNode shaoB;
    shaoB.next=head;
    struct ListNode* fast=head;
    struct ListNode* slow=&shaoB;
    int i=1;
    while(fast!=NULL){
        if(i>n){
            slow=slow->next;
        }
        fast=fast->next;
        i++;
    }
    slow->next=slow->next->next;
    return shaoB.next;
}
