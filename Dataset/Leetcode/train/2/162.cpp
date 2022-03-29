 class Solution {
 public:
	 ListNode* result = new ListNode;
	 ListNode* tial = result;
	 ListNode* XXX(ListNode* l1, ListNode* l2) {
		 if (l1 == NULL && l2 == NULL)
			 return NULL;
		 if (l1 == NULL && l2 != NULL)
			 return l2;
		 if (l2 == NULL && l1 != NULL)
			 return l1;
		 int num = 0;
		int addbit = 0;
		int apresult = 0;
		bool flag = true;
		ListNode* Pcurrent1 = l1;
		ListNode* Pcurrent2 = l2;
		while (Pcurrent1!= nullptr || Pcurrent2!= nullptr)
		{
			if(Pcurrent1==NULL)
				apresult = Pcurrent2->val + addbit;
			if(Pcurrent2==NULL)
				apresult = Pcurrent1->val + addbit;
			if(Pcurrent1!=NULL&&Pcurrent2!=NULL)
				apresult = Pcurrent1->val + Pcurrent2->val + addbit;
			if (apresult >= 10)
			{
				if (flag)
				{
					flag = false;
					apresult = apresult % 10;
					addbit = 1;
					result->val = apresult;
				}
				else
				{
					apresult = apresult % 10;
					addbit = 1;
					ListNode* newnode = new ListNode;
					newnode->val = apresult;
					tial->next = newnode;
					tial = newnode;
					
				}
			}
			else
			{
				if (flag)
				{
					flag = false;
					addbit = 0;
					result->val = apresult;

				}
				else
				{
					apresult = apresult % 10;
					addbit = 0;
					ListNode* newnode = new ListNode;
					newnode->val = apresult;
					tial->next = newnode;
					tial = newnode;
				}
				
			}
			if (Pcurrent1 == NULL&&Pcurrent2!=NULL)
			{
				Pcurrent2 = Pcurrent2->next;
			}
			if (Pcurrent2 == NULL && Pcurrent1 != NULL)
			{
				Pcurrent1 = Pcurrent1->next;
			}
			if (Pcurrent1 != NULL && Pcurrent2 != NULL)
			{
				Pcurrent1 = Pcurrent1->next;
				Pcurrent2 = Pcurrent2->next;
			}

		}
		if (addbit == 1)
		{
			ListNode* newnode = new ListNode;
			newnode->val = 1;
			tial->next = newnode;
			tial = newnode;
		}


		return result;
	}
};

