public class SumValue
{


    public static void main(String[] args)
    {
        int arr[]= new int [] {20,30,40,50,60};
        int sum = 0;

        for (int i = 0; i < arr.length ; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("sum values of an array: " +sum);

    }

}
