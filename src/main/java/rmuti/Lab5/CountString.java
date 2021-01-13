package rmuti.Lab5;

public class CountString {
    public static int countM(String str)
    {
        int aws=0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)== 'M' )
            {
                aws++;
            }
        }
        System.out.println(aws);
        return aws;
    }

    public static void main(String[] args) {
        System.out.println(countM("abcdMMD"));
    }
}
