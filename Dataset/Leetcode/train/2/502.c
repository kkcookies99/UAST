 /**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode l3;
    struct ListNode *p,*q,*curr;
    int carry=0,x,y,sum;
    p=l1,q=l2,curr=&l3;
    while(p||q){
        x=p?p->val:0;
        y=q?q->val:0;
        sum=x+y+carry;
        carry=sum/10;
        curr->next=(struct ListNode *)malloc(sizeof(struct ListNode));
        curr=curr->next;
        curr->val=sum%10;
        if(p)p=p->next;
        if(q)q=q->next;
    }
    if(carry>0){
        curr->next=(struct ListNode *)malloc(sizeof(struct ListNode));
        curr=curr->next;
        curr->val=carry;
    }
    curr->next=NULL;  
    return l3.next;
}

