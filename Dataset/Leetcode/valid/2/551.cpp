 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) { 
        auto tmp_l1node = l1;
        auto tmp_l2node = l2;

        ListNode *ret;
        auto tmp_val = tmp_l1node->val + tmp_l2node->val;
        if ( tmp_val < 10)
        {
            ret = new ListNode(tmp_val);
        } else 
        {
            ret = new ListNode(tmp_val - 10);
            ret->next = new ListNode(1);
        }
        tmp_l1node = tmp_l1node->next;
        tmp_l2node = tmp_l2node->next;

        ListNode *last = ret;
        ListNode *cur = last->next;
        while ( tmp_l1node || tmp_l2node)
        {
            if ( !cur)
            {
                cur = new ListNode(0);
                last->next = cur;
            }
            
            int tmp_sum = cur->val;
            if ( tmp_l1node) {
                tmp_sum += tmp_l1node->val;
                tmp_l1node = tmp_l1node->next;
            }
            if ( tmp_l2node) {
                tmp_sum += tmp_l2node->val;
                tmp_l2node = tmp_l2node->next;
            }

            if ( tmp_sum < 10)
            {
                cur->val = tmp_sum;
            } else 
            {
                cur->val = tmp_sum - 10;
                cur->next = new ListNode(1);
            }

            last = last->next;
            cur = cur->next;

                    }

        return ret;
    }
};

