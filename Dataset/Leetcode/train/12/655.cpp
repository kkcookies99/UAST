 class Solution {
public:
    string RomanRedeuce(int* innum)
{
	if (*innum >= 1000)
	{
		*innum -= 1000;
		return "M";
	}
	if (*innum >= 900)
	{
		*innum -= 900;
		return "CM";
	}
	if (*innum >= 500)
	{
		*innum -= 500;
		return "D";
	}
	if (*innum >= 400)
	{
		*innum -= 400;
		return "CD";
	}
	if (*innum >= 100)
	{
		*innum -= 100;
		return "C";
	}
	if (*innum >= 90)
	{
		*innum -= 90;
		return "XC";
	}
	if (*innum >= 50)
	{
		*innum -= 50;
		return "L";
	}
	if (*innum >= 40)
	{
		*innum -= 40;
		return "XL";
	}
	if (*innum >= 10)
	{
		*innum -= 10;
		return "X";
	}
	if (*innum >= 9)
	{
		*innum -= 9;
		return "IX";
	}
	if (*innum >= 5)
	{
		*innum -= 5;
		return "V";
	}
	if (*innum >= 4)
	{
		*innum -= 4;
		return "IV";
	}
	if (*innum >= 3)
	{
		*innum -= 3;
		return "III";
	}
	if (*innum >= 2)
	{
		*innum -= 2;
		return "II";
	}if (*innum >= 1)
	{
		*innum -= 1;
		return "I";
	}
    return "Error";
}
    string XXX(int num) {
    string output;
	while (num > 0)
	{
		output += RomanRedeuce(&num);
	}
	return output;
    }
};

