/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        if(l1->val == 0 && l1->next == nullptr) return l2;
        if(l2->val == 0 && l2->next == nullptr) return l1;
        int carry = 0;              //进位
        ListNode* ans = l1;    
        while(l1->next!=nullptr || l2->next!=nullptr)       //判断l1和l2的下一位是否为空，都为空则出循环
        {
            if(l1->next == nullptr) 
            {
                if(l1->val == 0)
                    if(carry == 0)
                    {
                        l1->val = l2->val;
                        l1->next = l2->next;
                        return ans;
                    }
                l1->next = new ListNode(0);
            }
            if(l2->next == nullptr)
            {
                if(l2->val == 0)
                    if(carry == 0)
                    {
                        return ans;
                    }
                l2->next = new ListNode(0);
            }
            int sum = l1->val + l2->val + carry;
            carry = 0;
            if(sum >= 10)
            {
                carry++;
                sum -= 10;
            }
            l1->val = sum;
            l1 = l1->next;
            l2 = l2->next;
        }
        //l1和l2的下一位都为空，但是本次还要算一次
        int sum = l1->val + l2->val + carry;
        carry = 0;
        if(sum >= 10)
        {
            carry++;
            sum -= 10;
        }
        l1->val = sum;
        //算完之后还要看是否有进位
        if(carry == 1) l1->next = new ListNode(1);
        return ans;
    }
};

