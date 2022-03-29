 struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
        struct ListNode* sumList = (struct ListNode*)malloc(sizeof(struct ListNode));
        struct ListNode* target = sumList;
        int sum,i = 0;
        while(l1 || l2){
            sum = 0;
            if(l1){
                i ? sum = 1,i = 0 : NULL;
                sum += (l1->val);
                l1 = l1->next;
            }
            if(l2){
                i ? sum = 1,i = 0 : NULL;
                sum += (l2->val);
                l2 = l2->next;
            }
            sum/10>0 ? i = 1,sum %= 10 : NULL;
            struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
            node->next = NULL;
            node->val = sum;
            sumList->next = node;
            sumList = node;
        }
        if(i){
            struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
            node->next = NULL;
            node->val = 1;
            sumList->next = node;
        }
        return target->next;
}

