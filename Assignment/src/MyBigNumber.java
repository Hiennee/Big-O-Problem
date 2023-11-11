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
        if (str2.length() > str1.length())
        {Swap();}
        boolean flag = false;
        String result = "";
        int j = str2.length()-1;
        //System.out.println(Character.getNumericValue(str2.charAt(4)));
        for (int i = str1.length()-1; i > 0; i--)
        {
            int tobeAdded = Character.getNumericValue(str1.charAt(i)) + Character.getNumericValue(str2.charAt(j));
            if (flag == true)
            {
                tobeAdded++;
                flag = false;
            }
            if (tobeAdded >= 10)
            {
                result += tobeAdded % 10;
                flag = true;
            }
            else
            {
                result += tobeAdded;
            }

            j--;
            if (j==-1)
            {
                if (flag == true)
                {
                    result += Character.getNumericValue(str1.charAt(i-1)) + 1;
                }
                else
                    result += Character.getNumericValue(str1.charAt(i-1));
                StringBuffer strBuffer = new StringBuffer(result);
                result = str1.substring(0, i-1) + strBuffer.reverse().toString();
            }

        }
        return result;
    }
    void Swap()
    {
        String tmp = str1;
        str1 = str2;
        str2 = tmp;
    }
}
