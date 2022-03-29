struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
  struct ListNode* p1 = l1;
  struct ListNode* p2 = l2;
  struct ListNode* l = (struct ListNode*)malloc(sizeof(struct ListNode));
  struct ListNode* p = l;
  int jw = 0;

  /* 先构建链表，计算 */
  while(p1!=NULL || p2!=NULL){
    if (p1!=NULL && p2!=NULL){
      p->next = (struct ListNode*)malloc(sizeof(struct ListNode));
      p = p->next;
      p->val = p1->val + p2->val;
      p1 = p1->next;
      p2 = p2->next;
    }
    else if (p1 != NULL){
      p->next = (struct ListNode*)malloc(sizeof(struct ListNode));
      p = p->next;
      p->val = p1->val;
      p1 = p1->next;
    }
    else if (p2 != NULL){
      p->next = (struct ListNode*)malloc(sizeof(struct ListNode));
      p = p->next;
      p->val = p2->val;
      p2 = p2->next;
    }
  }
  p->next = NULL;

  /* 进位处理 */
  p = l;
  while (p->next != NULL) {
    p->next->val += jw;
    if (p->next->val >= 10) {
      p->next->val -= 10;
      jw = 1;
    } else {
      jw = 0;
    }
    p = p->next;
  }

  /* 处理最高位进位的情况 */
  if (jw == 1)
  {
    jw = 0;
    p->next = (struct ListNode*)malloc(sizeof(struct ListNode));
    p = p->next;
    p->val = 1;
    p->next = NULL;
  }

  return l->next;
}

