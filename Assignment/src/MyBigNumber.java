public class MyBigNumber
{
    String str1, str2;
    MyBigNumber(String str1, String str2)
    {
        this.str1 = str1;
        this.str2 = str2;
    }
    String sum()
    {
        boolean flag = false;
        int len1 = str1.length()-1, len2 = str2.length()-1, tobeAdded = 0;
        int cAt1, cAt2;
        int maxlength = len1 > len2 ? len1 : len2;
        String res = "";

        for (int i = maxlength; i >= 0; i--)
        {

            if (len1 <= -1)
                cAt1 = 0;
            else
                cAt1 = str1.charAt(len1) - '0';
            if (len2 <= -1)
                cAt2 = 0;
            else
                cAt2 = str2.charAt(len2) - '0';
            if (flag == true)
            {
                tobeAdded = cAt1 + cAt2 + 1;
                flag = false;
            }
            else
                tobeAdded = cAt1 + cAt2;
            if (tobeAdded  >= 10)
            {
                res = tobeAdded % 10 + res;
                flag = true;
            }
            else
                res = tobeAdded + res;

            len1--;
            len2--;
        }
        return res;
    }
}
