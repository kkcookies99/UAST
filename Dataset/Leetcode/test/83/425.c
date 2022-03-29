 struct ListNode* XXX(struct ListNode* head){
        if(!head)
            return head;
        head->next = XXX(head->next);
        if(head->next && head->val == head->next->val)
            return head->next;
        return head;
}

