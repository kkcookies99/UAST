 struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
    int carry=0,jw=0;
    struct ListNode *r = l1;
    struct ListNode *l = l2;
    struct ListNode *result = (struct ListNode*)malloc(sizeof(struct ListNode));//创建链表空间
    struct ListNode *start = result; //保存链表头指针
  /* 先构建链表，计算 */
    while(r!=NULL||l!=NULL){
    if (r!=NULL && l!=NULL){
            start->next =(struct ListNode *)malloc(sizeof(struct ListNode));//分配链表结点的下一个空间
            start= start->next;//初始化节点
            start->val =(r->val+l->val+carry)%10;
            start = start->next;
            r= r->next;
            l= l->next;

            (r->val+l->val+carry/10)?(carry =1):(carry =0);  //判断数值是否大于10，是，则进位
    }
    else if (r != NULL){
      start->next = (struct ListNode*)malloc(sizeof(struct ListNode));
      start = start->next;
      start->val = r->val;
      r = r->next;
    }
    else if (l != NULL){
      start->next = (struct ListNode*)malloc(sizeof(struct ListNode));
      start = start->next;
      start->val = l->val;
      l = l->next;
    }
  }
  /* 处理最高位进位的情况 */
  if (jw == 1)
  {
    jw = 0;
    start->next = (struct ListNode*)malloc(sizeof(struct ListNode));
    start = start->next;
    start->val = 1;
    start->next = NULL;
  }
  return result->next;
}




