struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
int num1 = 0; int num2 = 0;
int jinwei = 0;
struct ListNode* t1 = l1;
struct ListNode* t2 = l2;
struct ListNode *res = (struct ListNode*)malloc(sizeof(struct ListNode));
res->next = NULL;
struct ListNode *s = res;
for(int i=0 ; t1 != NULL || t2 != NULL || jinwei != 0; i++) 
{
    if( t1 != NULL)
    {
        num1 = t1->val;
        t1 = t1->next;
    }
    else
    {
        num1 = 0;
    }
    if( t2 != NULL)
    {
        num2 = t2->val;
        t2 = t2->next;
    }
    else
    {
        num2 = 0;
    }
    s->val = num1 + num2 + jinwei;
    if(s->val >= 10)
    {
       jinwei = s->val/10;
       s->val = s->val % 10;
    }
    else
       jinwei = 0;
    if(t1 != NULL || t2 != NULL || jinwei != 0)
    {
        s->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        s = s->next;
        s->next = NULL;
    }
}
return res;
}

