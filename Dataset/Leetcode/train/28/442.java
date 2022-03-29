 class Solution {
    public int XXX(String haystack, String needle) {
        		
        char[] str1 = haystack.toCharArray();
        char[] str2 = needle.toCharArray();
        
        if (str1.length == 0 && str2.length == 0)
        {
        	return 0;
        }
        else if (str2.length == 0)
        {
        	return 0;
        }
        else if (str2.length > str1.length)
        {
        	return -1;
        }
        
        int index = -1;
        int k = 0;
        
        for (int i = 0; i < str1.length; i++)
        {
            if (k >= str2.length)
            {
                break;
            }

        	if (str1[i] == str2[k])
        	{
        		k++;
        		
        		if (index == -1)
        		{
        			index = i;
        		}
        	}
        	else
        	{
                if (index != -1)
                {
                    i = index;
                }
                
        		k = 0;
        		index = -1;
        	}
        }
        
        if (k != str2.length)
        {
        	index = -1;
        }
        
        return index;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


