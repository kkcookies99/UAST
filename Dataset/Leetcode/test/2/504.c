 struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
    struct ListNode *p1=l1;
    struct ListNode *p2=l2;
    struct ListNode *l3,*p3;
    l3=(struct ListNode *)malloc(sizeof(struct ListNode)); //开辟头节点,为了尾插法统一代码
    l3->next=NULL;
    p3=l3; //p3尾指针
    struct ListNode *p;
    int n1,n2,sum;
    int flag=0; //进位值
    while(p1||p2) 
    {
        p=(struct ListNode *)malloc(sizeof(struct ListNode));
        p->next=NULL;
        n1=p1?p1->val:0; 
        n2=p2?p2->val:0;
        sum=n1+n2+flag;
        p->val=sum%10;
        if(flag>0)
            flag--;
        if(sum>9) 
            flag++;
        p3->next=p;
        p3=p;
        if(p1)
             p1=p1->next;
        if(p2)
             p2=p2->next;
    }
    if(flag>0) //进位值不为0 则多开辟一个节点存放进位值
    {
        p=(struct ListNode*)malloc(sizeof(struct ListNode));
        p->val=1;
        p->next=NULL;
        p3->next=p;
        p3=p;
    }
    return l3->next;  //舍弃头节点
}

