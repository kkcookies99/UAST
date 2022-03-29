class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int resume=1;
		transform(digits.rbegin(),digits.rend(),
                  digits.rbegin(),
                 [&resume](int elem)
                 {
                    int temp=resume;
                    resume=(elem+resume)/10;
                     return (elem+temp)%10;
                  });
                if(resume!=0)
                digits.insert(digits.begin(),resume);
				return digits;
			}
};

