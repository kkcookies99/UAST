 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode* result = new ListNode(0);     // result
        ListNode* tmp = NULL;                   // temp node
        int of = 0, sum = 0;                    // overflow and sum

        while(of != 0 || l1 != NULL || l2 != NULL){
            if (tmp == NULL){
                tmp = result;                   // Initialize
            }else{
                tmp->next = new ListNode(0);    // add new node
                tmp = tmp->next;                
            }
            sum = of;                           // add overflow from previous op first
            if (l1 != NULL){
                sum += l1->val;                 // add
                l1 = l1->next;
            }
            if (l2 != NULL){
                sum += l2->val;                 // add
                l2 = l2->next;
            }
            tmp->val = sum % 10;                // save one digit
            of = sum / 10;                      // save overflow for next step
        }        
        return result;
    }
};

