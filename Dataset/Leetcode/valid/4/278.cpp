 vector<int> conVec;
        int min;
        auto it1=nums1.begin();
        auto it2=nums2.begin();
        while(1)
        {
            if(it1==nums1.end() || it2==nums2.end()) break;
            min = (*it1<*it2) ? (*it1++) : (*it2++);
            conVec.push_back(min);
        }
         
        while(it1!=nums1.end())
        {
             conVec.push_back(*it1++);
        }

         while(it2!=nums2.end())
        {
             conVec.push_back(*it2++);
        }

        int count = conVec.size();
        if(count%2 == 0)
        {
            return ((double)(conVec[count/2 - 1] + conVec[count/2]))/2;
        }
        else
        {
            return conVec[count/2];
        }


