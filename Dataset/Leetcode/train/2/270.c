/*链表更新时需要遍历每一个节点，所以需要定义两个链表，一个用来更新链表数据，另一个指向第一个链表的头，用于返回数据。*/
struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2) {
   struct ListNode* l3 = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* pre = l3;
    int carry = 0;         //记录进位值
    int x,y,sum;            //保存节点值和求和值
    while(l1 || l2){
        x = l1? l1->val : 0;
        y = l2? l2->val : 0;
        sum = x + y +carry;
        carry = sum/10;
        pre->next =(struct ListNode*)malloc(sizeof(struct ListNode));
        pre = pre->next;
        pre->val = sum%10;
        if(l1) l1 = l1->next;
        if(l2) l2 = l2->next;
    }
    if(carry>0){
        pre->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        pre = pre->next;
        pre->val = carry;
        pre->next = NULL;
    }else{
        pre->next = NULL;
    }
    return l3->next;
}


