class Solution {
public:
   ListNode* XXX(ListNode* L1, ListNode* L2) {
        int sum=0;
        ListNode* p1=L1;
        ListNode* p2=L2;
        ListNode* l3=new ListNode(0);
        ListNode* p=l3;
        while(p1!=NULL||p2!=NULL||sum>0){
            if(p1!=NULL){
                sum+=p1->val;
                p1=p1->next;
            }
            if(p2!=NULL){
                sum+=p2->val;
                p2=p2->next;
            }
            p->val=sum%10;
            sum/=10;
            if(p1!=NULL||p2!=NULL||sum>0){
                p->next=new ListNode(0);
                p=p->next;
            }
        }
        return l3;
    }
};

