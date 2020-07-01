public class AscendingOrder
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp = 0;

        System.out.println("values of Original Array");

        for (int i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i <arr.length ; i++)
        {
            for (int j = 0; j <arr.length ; j++)
            {
                if(arr[i]> arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            
        }

    }
        System.out.println();

        System.out.println("value of array sorted in ascending order: ");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
}
}
