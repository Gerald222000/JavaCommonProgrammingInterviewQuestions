package LeetCode;


class Roman
{
//  Set first the Roman to Number value
    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    int romanToInt(String s)

    {
        System.out.println("s:" + s.length());
        int total = 0;
        for (int i=0; i<s.length(); i++)

        {

            int s1 = value(s.charAt(i));
            System.out.println("s.charAt(i): "+ s.charAt(i));
            System.out.println("s1: "+ s1);

            if (i+1 <s.length())
            {
                boolean x = i+1 <s.length();
                System.out.println("x: "+ x);
                System.out.println("i+1: "+ i+1);
                System.out.println("s.length(): "+ s.length());

                int s2 = value(s.charAt(i+1));
                System.out.println("s2: "+ s2);
                if (s1 >= s2)
                {
                    total = total + s1;
                    System.out.println("total:" + total);
                }
                else
                {
                    total = total - s1;
                    System.out.println("total:" + total);
                }
            }
            else
            {
                total = total + s1;
            }
        }
        System.out.println("return total:" + total);
        return total;



    }

    // Driver code
    public static void main(String args[])
    {
        Roman ob = new Roman();
        String val = "IV";
        System.out.println(ob.romanToInt(val));
    }
}