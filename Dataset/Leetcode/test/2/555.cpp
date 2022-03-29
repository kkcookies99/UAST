 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) 
    {
        int temp = 0;
		ListNode* dummyRoot = new ListNode(0);
		ListNode* ans=dummyRoot;  // = new ListNode(0);
		
        
		
		while (l1 != NULL || l2 != NULL)
		{
			ans->next = new ListNode(0);
			ans = ans->next;
            if (l1 != NULL)
			{
				temp += l1->val;
				l1 = l1->next;
			}

			if (l2 != NULL)
			{
				temp += l2->val;
				l2 = l2->next;
			}
			ans->val += (temp % 10);
            temp/=10;
           
                          
			
		}
        if(temp)
            ans->next = new ListNode(temp); 
		ans = dummyRoot->next;
        //ans=ans->next;
		delete dummyRoot;
		return ans;
    }

};

