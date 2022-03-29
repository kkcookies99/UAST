/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *p1,*p2,*p,*a,*b,*l3;int length1=0,length2=0;
    l3=(struct ListNode*)malloc(sizeof(struct ListNode));p=l3;
    p1=l1,p2=l2;
    for(length1=0;p1!=NULL;length1++)
    {
        b=p1;
        p1=p1->next;
    }
    for(length2=0;p2!=NULL;length2++)
    {
        a=p2;
        p2=p2->next;
    }
    int max,min,c=0;
    if(length1>length2)
    {
        min=length2,max=length1;
        for(int i=min;i<max;i++)
        {
            p2=(struct ListNode*)malloc(sizeof(struct ListNode));
            p2->val=0;p->next=NULL;
            a->next=p2;a=a->next;
        }
    }
    else   
    {
         min=length1,max=length2;
        for(int i=min;i<max;i++)
        {
            p1=(struct ListNode*)malloc(sizeof(struct ListNode));
            p1->val=0;p->next=NULL;
            b->next=p1;b=b->next;
        }
    }
    
    a=l3;p1=l1,p2=l2;
     int temp;
    
    for(int i=0;i<=max&&p1!=NULL&&p2!=NULL;i++,temp=0)
    {
        p=(struct ListNode*)malloc(sizeof(struct ListNode));
        if(p1!=NULL&&p2!=NULL)
        {
            temp=p1->val+p2->val+c;
        }
        if(temp>=10)
        {
            temp=temp%10;
            c=1;
        }
        else 
        {
            c=0;
        }
        p->val=temp;a->next=p;a=a->next;
        p1=p1->next;p2=p2->next;p->next=NULL;
    }
    if(c==1)
    {
        p=(struct ListNode*)malloc(sizeof(struct ListNode));a->next=p;
        p->val=1;p->next=NULL;
    }
    return l3->next;
    
}

