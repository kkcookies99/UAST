 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode* res = new ListNode;
        ListNode* ress = res;
        queue<int> m1, m2;
        // unordered_map<int> m2;
        while(l1)
        {
            m1.push(l1->val);
            l1 = l1->next;
        }
        while(l2)
        {
            m2.push(l2->val);
            l2 = l2->next;
        }
        int n1 = m1.size();
        int n2 = m2.size();
        if(n1>=n2)
        {
            int sum = 0;
            int val, val1, val2=0;
            for(int i = 0; i < n1;i++)
            {
                
                if(i<n2)
                {
                    sum += m1.front()+m2.front();
                    if(sum>9 && i==n1-1)
                    {
                        val1 = sum % 10;
                        val2 = sum / 10;
                    }
                    val = sum % 10;
                    sum = sum / 10;
                    m1.pop();
                    m2.pop();
                }
                
                else
                {
                    sum += m1.front();
                    if(sum>9 && i==n1-1)
                    {
                        val1 = sum % 10;
                        val2 = sum / 10;
                    }
                    val = sum%10;
                    sum = sum / 10;
                    m1.pop();
                
                }
                if(i==n1-1 && val2>0)
                {
                    ListNode* newnode1 = new ListNode(val1);
                    ListNode* newnode2 = new ListNode(val2); 
                    newnode1->next = newnode2;
                    res->next = newnode1;
                    res = res->next;
                    

                }
                else{
                    ListNode* newnode = new ListNode(val);
                
                    newnode->next = nullptr;
                    res->next = newnode;
                    res = res->next;
                }
            }
        }

        else
        {
            int sum = 0;
            int val, val1, val2=0;
            for(int i = 0; i < n2;i++)
            {
                if(i<n1)
                {
                    sum += m1.front()+m2.front();
                    if(sum>9 && i==n2-1)
                    {
                        val1 = sum % 10;
                        val2 = sum / 10;
                    }
                    val = sum % 10;
                    sum = sum / 10;
                    m1.pop();
                    m2.pop();
                    
                }
                else
                {
                    sum += m2.front();
                    if(sum>9 && i==n2-1)
                    {
                        val1 = sum % 10;
                        val2 = sum / 10;
                    }
                    val = sum % 10;
                    sum = sum / 10;
                    m2.pop();
                }
                if(i==n2-1 && val2>0)
                {
                    ListNode* newnode1 = new ListNode(val1);
                    ListNode* newnode2 = new ListNode(val2); 
                    newnode1->next = newnode2;
                    res->next = newnode1;
                    res = res->next;
                }
                else{
                    ListNode* newnode = new ListNode(val);
                
                    newnode->next = nullptr;
                    res->next = newnode;
                    res = res->next;
                }
                
            }
        }
        return ress->next;
    }
};
