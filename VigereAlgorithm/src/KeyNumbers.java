public class KeyNumbers
{
    public int FindNumber(char key,String alphabet)
    {
        if(alphabet.isBlank())
        {
            alphabet="abcdefghijklmnopqrstuvwxyz";
            for(int i=0;i<alphabet.length();i++)
            {
                if(alphabet.charAt(i)==key)
                {
                    return i;
                }
            }
        }
        else
        {
            for(int i=0;i<alphabet.length();i++)
            {
                if(alphabet.charAt(i)==key)
                {
                    return i;
                }
            }
        }
        return 0;
    }

    public char FindChar(int number,String alphabet)
    {
        if(alphabet.isBlank())
        {
            alphabet="abcdefghijklmnopqrstuvwxyz";

            return alphabet.charAt(number);
        }
        else
        {
            return alphabet.charAt(number);
        }
    }
}
