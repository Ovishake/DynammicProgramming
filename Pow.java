import java.util.ArrayList;
import java.util.LinkedList;

class Pow
{
    static ArrayList<LinkedList<Character>> powerset(char[] set)
    {
        //Linked List to store the set elements
        LinkedList<Character> char_list = new LinkedList<>();
        //LinkedList to store the arrays
        ArrayList<LinkedList<Character>> list = new ArrayList<>();

        int set_size = set.length;

        long pow_set_size = Math.pow(2, set_size);

        int counter, j;

        for(counter = 0; counter < pow_set_size; counter++)
        {
            for(j=0; j<set_size;j++)
            {
                if((counter & (1<<j))>0 )
                {
                    char_list.add(set[j]);
                }
                //adding to the list of power set
                list.add(char_list);
                //Clearing the list for new addition
                char_list.clear();
            }
        }
    }

    static void powerset_recursion(String str, int index, String curr)
    {
        int n = set.length;

        if(index == n)
        {
            return;
        }

        System.out.println(curr);
        for(int i=index+1, i<n; i++)
        {
            curr += str.charAt(i);

            powerset_recursion(str, i, curr);

            curr = curr.substring(0, curr.length()-1);
        }
    }
}