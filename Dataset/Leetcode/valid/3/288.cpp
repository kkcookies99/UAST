 class Solution {
public:
   int _GetMaxSub(int _StartIndex, int _LastLen, std::string& s)
	{
		std::string_view _View(s.data() + _StartIndex, _LastLen - 1);
		int _EndIndex = _StartIndex + _LastLen - 1;
		
		int _RetValue = _LastLen - 1;
		while (_View.find(s[_EndIndex]) == std::string::npos && _EndIndex < s.length() )
		{
			std::string_view _NewView(s.data() + _StartIndex, _EndIndex - _StartIndex + 1);
			_View = _NewView;
			++_EndIndex;
		}
		return _View.size();
	}

	int XXX(string s) {
		if (s.length() <= 1)
			return s.length();

		int _MaxLen(0);
		int _StartIndex(0);
		int _EndIndex(0);
		while ( _EndIndex < s.length() - 1 && s.length() - _StartIndex > _MaxLen )
		{
			int _LastLen = _EndIndex - _StartIndex + 1;
			int _CurrentLen = _GetMaxSub(_StartIndex, _LastLen, s);
			if (_CurrentLen > _MaxLen)
			{
				_MaxLen = _CurrentLen;
			}
			_EndIndex = _StartIndex + _CurrentLen;
			++_StartIndex;
		}
		return _MaxLen;
	}
};

