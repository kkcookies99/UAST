 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        auto dummy = new ListNode(-1) ; auto pre = dummy ;
        int t = 0 ;
        while(l1 != nullptr || l2 !=nullptr || t != 0){
            if(l1 != nullptr){
                t += l1 -> val ;
                l1 = l1 -> next ;
            }
            if(l2 != nullptr){
                t += l2 -> val ;
                l2 = l2 -> next ;
            }
            pre -> next = new ListNode(t % 10) ;
            pre = pre -> next ;
            t = t / 10 ;
        }
        return dummy -> next ;
    }
};

