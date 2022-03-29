class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int carry=0;
        ListNode* resHead = new ListNode(0);
        ListNode* curr = resHead;
        while(l1!=NULL || l2!=NULL){
            l1=l1->val!=NULL?(carry+=l1->val,l1=l1->next):l1;
            l2=l2->val!=NULL?(carry+=l2->val,l2=l2->next):l2;
            curr->next = new ListNode(carry%10);
            curr = curr->next;
            carry/=10;
        }
        if(carry==1)
            curr->next = new ListNode(carry); 
        
        return resHead->next;
    }
};

