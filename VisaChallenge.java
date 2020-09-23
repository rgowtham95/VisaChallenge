package Visa;

public class VisaChallenge
{
    public static String compressWord(String word, int k)
    {
        int i = 0;
        while(checkDuplicates(word, k))
        {
            String test = word.substring(i, i + k);
            boolean same = true;
            for(int j = 0; j < test.length()-1; j++)
            {
                if(test.charAt(j) != test.charAt(j+1))
                {
                    same = false;
                }
            }
            if(same)
            {
                word = word.replace(test, "");
            }
            i++;
            if(i >= word.length() - test.length())
            {
                i = 0;
            }

        }
        return word;
    }

    public static boolean checkDuplicates(String word, int k)
    {

        String text = "";
        for(int i = 0; i <= word.length() - k; i++)
        {
            int count = 1;
            text = word.substring(i, i + k);
            int j = 0;
            while(j < text.length() - 1) {
                if(text.charAt(j) == text.charAt(j+1))
                {
                    count++;
                }
                j++;
            }
            if(count >= k)
            {
                return true;
            }
        }
        return false;
    }
}
