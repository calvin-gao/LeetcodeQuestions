package Problems;

public class removeDuplicates
{
    public static void main(String args[])
    {
        int [] arrTest = {1,2,2};
        System.out.println(removeDuplicate(arrTest));
    }


    public static int removeDuplicate(int [] arr )
    {
        int seen = 0;
        int counter = 1;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[seen] != arr[i])
            {
                seen++;
                counter++;
                int temp = arr[seen];
                arr[seen] = arr[i];
                arr[i] = temp;
            }
        }
        return counter;
    }
}