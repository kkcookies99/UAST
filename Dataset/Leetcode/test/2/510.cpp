 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        if(l1==NULL || l2==NULL) return l1?l1:l2;
        ListNode H(0), *p=&H;
        for(int carry=0; l1 || l2 || carry; carry/=10){
            if(l1) carry+=l1->val, l1=l1->next;
            if(l2) carry+=l2->val, l2=l2->next;
            p=p->next=new ListNode(carry%10);
        }
        return H.next;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


