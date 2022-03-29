 struct ListNode* XXX(struct ListNode* head, int n){
    int m = 0;
    struct ListNode *temp = NULL;
    struct ListNode *list = head;
    while(head->next != NULL)
    {
        head = head->next;
        m++;
        if(m == n)
        {
            temp = list;
            continue;
        }
        if(temp)
            temp = temp->next;
    }

    if(temp == NULL)
    {
        head = list->next;
        free(list);
        return head;
    }

    head = temp->next;
    temp->next = temp->next->next;
    free(head);
    return list;
}

