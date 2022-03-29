 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        //1.长+段(有+空) 2.1+99
        ListNode* root=new ListNode(0);
        ListNode *p=l1,*q=l2,*cur=root;
        int carry=0;
        while(p!=NULL||q!=NULL){
            int x=(p!=NULL)?p->val:0;
            int y=(q!=NULL)?q->val:0;
            int sum=x+y+carry;
            carry=sum/10;
            cur->next=new ListNode(sum%10);
            cur=cur->next;
            if(p!=NULL) p=p->next;
            if(q!=NULL) q=q->next;
        }
        if(carry>0) cur->next=new ListNode(carry);
        return root->next;
    }
};

