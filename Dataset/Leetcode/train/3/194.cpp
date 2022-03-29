 int XXX(string s) {
	int nLen = s.length();

	int nRes = 0;
	int nCur = 0;
	int arr[256] = { 0 };
	int nSplitIdx = 0;

	for (int i = 0; i < nLen; ++i)
	{
		int nCurVal = (int)s[i];
		int nLastIdx = arr[nCurVal];
		if (nLastIdx == 0 || nLastIdx < nSplitIdx)
		{
			++nCur;
		}
		else
		{
			if (nLastIdx > nSplitIdx){
				nCur = i + 1 - nLastIdx;
				nSplitIdx = nLastIdx;
			}
		}

		if (nCur > nRes)
		{
			nRes = nCur;
		}

		arr[nCurVal] = i + 1;
	}
		
	return nRes;
}

