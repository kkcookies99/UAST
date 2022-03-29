 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode* head = new ListNode(-1);
        ListNode* cur = head;

        int carry = 0;//存放进位
        while( l1 != NULL || l2 != NULL ) {
            int sum = 0; //存放当前位的值
            sum += carry;//当前位加上carry位
            carry = 0;//清零一下carry
            if ( l1 != NULL ){
                sum += l1->val;
                l1 = l1->next;
            }
            if ( l2 != NULL ){
                sum += l2->val;
                l2 = l2->next;
            }
            carry = sum / 10;
            sum = sum % 10;
            if ( carry > 0 )
                cur->next = new ListNode(sum);
            cur = cur->next;
        }
        if (carry > 0){
            cur->next = new ListNode(1);
        }
        return head->next;
    }
};

