import java.util.LinkedList;

//Collection of important interview code

class RodCutting
{
    static int cutRod(int[] price, int n)
    {
        int memo[] = new int[n+1];
        int max_val = Integer.MIN_VALUE;
        memo[0] = 0;

        for(int i = 1; i <= n; i++)
        {
            for(int j=0; j <i; j++)
            {
                max_val = Math.max(max_val, cutRod(price, i - j - 1));

                memo[i] = max_val;
            }
        }

        return memo[n];
    }

    static int cutRod_LL(int[] price, int n)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int max_val = Integer.MIN_VALUE;
        // memo[0] = 0;
        list.add(0);

        for(int i = 1; i <= n; i++)
        {
            for(int j=0; j <i; j++)
            {
                max_val = Math.max(max_val, cutRod_LL(price, i - j - 1));

                list.add(max_val);
            }
        }

        return list.get(max_val);
    }
}