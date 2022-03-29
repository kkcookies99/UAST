struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){

    struct ListNode* p1 = l1;
    struct ListNode* p2 = l2;
    //申请一个新的空链表
    struct ListNode* head = (struct ListNode*)malloc(sizeof(struct ListNode));
    head->next = NULL;
    //申请一个尾指针，后面采用的是尾插法增加新节点
    struct ListNode* tail = head;
    struct ListNode* p3;
    int carry = 0;
    int temp = 0;
    while(p1 && p2) //两个链表的节点还是一一对应的时候，走该分支
    {
        //申请新的节点
        p3 = (struct ListNode*)malloc(sizeof(struct ListNode));
        temp = p1->val + p2->val + carry;
        if(temp > 9)
        {
            carry = 1;
            p3->val = temp % 10;
        }
        else
        {
            carry = 0;
            p3->val = temp;
        }
        tail->next = p3;//尾指针指向刚才生成的新节点
        tail = p3;//让新的节点变成尾指针

        p1 = p1->next;
        p2 = p2->next;

    }
    while(p1)//有一个链表还有节点，但另一个链接已经没有节点了，走该分支
    {
        p3 = (struct ListNode*)malloc(sizeof(struct ListNode));
        temp = p1->val + carry;
        if(temp > 9)
        {
            carry = 1;
            p3->val = temp % 10;
        }
        else
        {
            carry = 0;
            p3->val = temp;
        }

        tail->next = p3;
        tail = p3;
        p1 = p1->next;
    }
    while(p2)
    {
        p3 = (struct ListNode*)malloc(sizeof(struct ListNode));
        temp = p2->val + carry;
        if(temp > 9)
        {
            carry = 1;
            p3->val = temp % 10;
        }
        else
        {
            carry = 0;
            p3->val = temp;
        }
        tail->next = p3;
        tail = p3;
        p2 = p2->next;        
    }
    if(carry == 1) //两个链表加完之后最高位之和>=10，有进位，新建节点存放这个进位
    {
        p3 = (struct ListNode*)malloc(sizeof(struct ListNode));
        p3->val = carry;   
        carry = 0;
        tail->next = p3;
        tail = p3;             
    }    
    tail->next = NULL;    
    return head->next;
}

