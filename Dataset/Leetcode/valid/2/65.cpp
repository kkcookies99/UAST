class Solution 
{
public:
    ListNode* XXX(ListNode* node1, ListNode* node2) 
    {
        ListNode* l1 = node1;
        ListNode* l2 = node2;  
        ListNode* tail1 = node1;   
        ListNode* tail2 = node2;   
        bool jinwei = false;
        //l1 l2 都不为空时
        while (l1 && l2)
        {
            int val;
            if (jinwei)
            {
                val = l1 -> val + l2 -> val + 1;
                if (val >= 10)
                {
                    l1 -> val = val - 10;
                    l2 -> val = val - 10;
                    jinwei = true;
                }
                else
                {
                    l1 -> val = val;
                    l2 -> val = val;
                    jinwei = false;
                }
            }
            else
            {
                val = l1 -> val + l2 -> val;
                if (val >= 10)
                {
                    l1 -> val = val - 10;
                    l2 -> val = val - 10;
                    jinwei = true;
                }
                else
                {
                    l1 -> val = val;
                    l2 -> val = val;
                    jinwei = false;
                }
            }
            if (!l1 -> next)
                tail1 = l1;
            if (!l2 -> next)
                tail2 = l2;
            l1 = l1 -> next;
            l2 = l2 -> next;
        }
        bool choosel1 = true;
        if (!l1 && l2)
            choosel1 = false;
        //l1为空 l2不为空
        while (!l1 && l2)
        {
            if (jinwei)
            {
                int val = l2 -> val + 1;
                if (val >= 10)
                {
                    l2 -> val = val - 10;
                    jinwei = true;
                }
                else
                {
                    l2 -> val = val;
                    jinwei = false;
                }
            }
            else
            {
                int val = l2 -> val;
                if (val >= 10)
                {
                    l2 -> val = val - 10;
                    jinwei = true;
                }
                else
                {
                    l2 -> val = val;
                    jinwei = false;
                }
            }
            if (!l2 -> next)
                tail2 = l2;
            l2 = l2 -> next;
        }
        //l1不为空，l2为空时
        while (l1 && !l2)
        {
            if (jinwei)
            {
                int val = l1 -> val + 1;
                if (val >= 10)
                {
                    l1 -> val = val - 10;
                    jinwei = true;
                }
                else
                {
                    l1 -> val = val;
                    jinwei = false;
                }
            }
            else
            {
                int val = l1 -> val;
                if (val >= 10)
                {
                    l1 -> val = val - 10;
                    jinwei = true;
                }
                else
                {
                    l1 -> val = val;
                    jinwei = false;
                }
            }
            if (!l1 -> next)
                tail1 = l1;
            l1 = l1 -> next;
        }
        if (jinwei)
        {
            ListNode* newListnode = new ListNode;
            newListnode -> val = 1;
            newListnode -> next = nullptr; 
            tail1 -> next = newListnode;
            tail2 -> next = newListnode;
        }
        if (choosel1)
            return node1;
        else
            return node2;
    }
};

