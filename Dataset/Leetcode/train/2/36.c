/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

int counts = 0;//sumOfAll是counts + 1 或 counts + 2位数字
struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
    int sumOfAll = sum(l1) + sum(l2);
    struct ListNode* head = (struct ListNode*)malloc(sizeof(struct ListNode));
    head->next = NULL;
    for(int i = counts + 1;i >= 0;i--)
    {
        if(sumOfAll / (int)pow(10,i) == 0 && i == counts + 1)
            continue;
        //以下是头插法
        if(sumOfAll == 0)
        {
            head->val = 0;
            return head;
        }
        struct ListNode* ret = (struct ListNode*)malloc(sizeof(struct ListNode));
        ret->val = sumOfAll / (int)pow(10,i);
        sumOfAll -= ret->val * pow(10,i);
        ret->next = head->next;
        head->next = ret;
    }
    return head->next;
}
int sum(struct ListNode* l)
{
    int sums = 0,count = -1;
    while(l != NULL)
    {
        count++;
        sums += (int)pow(10,count) * l->val;
        l = l->next;
    }
    if(counts < count)
        counts = count;
    return sums;
}

