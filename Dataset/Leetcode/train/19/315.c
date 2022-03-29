 struct ListNode* XXX(struct ListNode* head, int n){
    struct ListNode *p=head;
    struct ListNode *Position[30];
    int i=0;
    while(p!=NULL)
    {
        Position[i++]=p;
        p=p->next;        
    }
    //i就是链表的长度，要删除倒数第n个节点就是删除i-n这个节点
    //假如只有一个节点那么就不存在上一个节点了
    if(i-n-1!=-1)//上一个节点存在时
    {
        Position[i-n-1]->next=Position[i-n]->next;
        return head;       
    }else
    {
        if(i==1)//只有一个节点时
            return NULL;
        else 
        {
            head=Position[1];
            return head;
        }
        
    }

}

