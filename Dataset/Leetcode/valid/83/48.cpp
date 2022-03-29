class Solution {
public:
    ListNode* XXX(ListNode* head) {
        auto dummy = new ListNode(-1) ;
        dummy -> next = head ;
        auto p = dummy ;
        while(p -> next){
            auto q = p -> next ;
            while(q -> next && q -> next -> val == p -> next -> val) q = q -> next ;
            if(p -> next = q) p = q ;
            else p -> next = q ;
        }
        return dummy -> next ;

    }
};

