struct ListNode* l3=(struct ListNode*)malloc(sizeof(struct ListNode));
struct ListNode * phead = l3;

int carry = 0;

while(l1 && l2)
{
    struct ListNode* node=(struct ListNode*)malloc(sizeof(struct ListNode));
    node->next = NULL;
    phead ->next= node;
    phead->val = (l1->val + l2->val + carry) % 10;
    carry = (l1->val + l2->val + carry)/10;

    l1 = l1->next;
    l2 = l2->next;
    phead = node;
}
if(l1)phead->next = l1;
else if(l2)phead->next = l2;
return l3;

