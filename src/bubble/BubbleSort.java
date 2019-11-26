package bubble;

import java.util.Random;

public class BubbleSort
{
    public static void main(String[] args)
    {
        //create test array and sort it
//        int[] input = { 7, 3, 1, 9, 5, 4, 1};
        int [] array = createRandomArray(100000);
        bubbleSort(array);

        //print out all elements and see if theyre sorted
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }


    public static void bubbleSort(int[] array)
    {
        for (int j = 1; j <= array.length - 1; j++)
        {
            for (int i = 0; i < array.length-1; i++)
            {
                if(array[i]>array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i+1] = temp;
                }
            }
        }
    }

    public static int[] createRandomArray(int size)
    {
        Random random = new Random();
        int [] randomArray = new int[size];

        for (int i = 0; i < randomArray.length; i++)
        {
            randomArray[i] = random.nextInt(size + 1);
        }

        return randomArray;
    }
}
