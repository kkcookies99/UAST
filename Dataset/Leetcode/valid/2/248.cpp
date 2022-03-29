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
        ListNode* p1 = l1;
        ListNode* p2 = l2;
        ListNode* res = l1;
        int carry = 0;
        while (p1 != nullptr && p2 != nullptr) {
            int n = p1->val + p2->val + carry;
            res->val = n % 10;
            carry = n / 10;
            if (p1->next == nullptr) {
                if (p2 == nullptr && carry == 0) break;
                res->next = l2;
            }
            if (p2->next != nullptr || p1->next != l2 || carry == 1) res = res->next;
            p1 = p1->next;
            p2 = p2->next;
            if (p1 == l2) break;
        }
        while (p1 != nullptr) {
            if (p1 == l2) break;
            int n = p1->val + carry;
            res->val = n % 10;
            carry = n / 10;
            if (p1->next == nullptr){
                if (p2 == nullptr && carry == 0) break;
                res->next = l2;
            } 
            res = res->next;
            p1 = p1->next;
        }
        while (p2 != nullptr) {
            int n = p2->val + carry;
            res->val = n % 10;
            carry = n / 10;
            if (p2->next != nullptr || carry == 1) res = res->next;
            p2 = p2->next;
        }
        if (carry == 1) {
            res->val = 1;
        }
        res->next = nullptr;
        return l1;
    }
};

