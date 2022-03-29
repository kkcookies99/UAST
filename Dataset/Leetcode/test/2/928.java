 class Solution {
    int cf = 0 ;
    ListNode* res=nullptr;
    ListNode* idx=nullptr;
    int tmp;

int handle(ListNode* ll){
    if(ll)return ll->val;
    else return 0;
}

public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        while(l1||l2){
            tmp=handle(l1)+handle(l2);
            if(idx){
                idx->next=new ListNode((tmp+cf)%10);
                idx=idx->next;
            }else{
                res = new ListNode((tmp+cf)%10);
                idx = res;
            }
            cf=(tmp+cf)/10;
            if(l1)l1=l1->next;
            if(l2)l2=l2->next;
        }
        if(cf!=0){
            idx->next= new ListNode(cf);
        }
        return res;
    }
};

