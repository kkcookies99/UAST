struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
struct ListNode *p1=l1;
int ans=0;
int sum=0;
while(l1->next!=0&&l2->next!=0){
    sum=(l1->val)+(l2->val)+ans;
    ans=0;
    ans=sum/10;
    sum%=10;
    l1->val=sum;
    l1=l1->next;
    l2=l2->next;
}
sum=(l1->val)+(l2->val)+ans;
    ans=0;
    ans=sum/10;
    sum%=10;
    l1->val=sum;
if(l2->next==0&&l1->next==0){ 
}
else{
    if(l1->next==0&&l2->next!=0){
    l1->next=l2->next;
    l1=l1->next;
   
    }
    else{
    l1=l1->next;   
    }
     while(l1->next!=0){
        sum=(l1->val)+ans;
        ans=0;
        ans=sum/10;
        sum%=10;
        l1->val=sum;
        l1=l1->next;
    }
     sum=(l1->val)+ans;
        ans=0;
        ans=sum/10;
        sum%=10;
        l1->val=sum;
    }
    if(ans!=0){
        l1->next=(struct ListNode*)malloc(sizeof(struct ListNode));
        l1=l1->next;
        l1->next=NULL;
        l1->val=ans;
    }
return p1;
}

