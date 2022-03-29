 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        queue<ListNode *> cache;
        ListNode *root = new ListNode(0, head);
        while(head){
            if(cache.size() == n+1)
                cache.pop();
            cache.push(head);
            head = head->next;
        }
        cache.push(nullptr);
        if(cache.size() < n + 2)
            return root->next->next;
        ListNode *pre = cache.front();
        cache.pop();
        cache.pop();
        ListNode *post = cache.front();
        pre->next = post;
        return root->next;
    }
};

