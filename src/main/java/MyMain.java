import java.util.Arrays;

//java.util.Random;
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int halflength = 0;
        halflength = arr.length / 2;
        int k = 5;
        int x = 0;
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        int[] arr4 = new int[10];
        for (int i = 0; i < halflength; i++)
        {
                arr2[i] = arr[i];
        }
        for (int j = 0; j < 5; j++)
        {
            {
                arr3[j] = arr[k];
                k = k + 1;
            }
        }
        //return arr3;
        for (int i = 0; i < arr.length; i = i + 2)
        {
            
           arr4[i] =  arr2[x];
           arr4[i + 1] = arr3[x];
           x = x + 1;
           //return arr4;
        }
        return arr4;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) {
        int q = 0;
        int k = 0;
        int x = 0;
        int n = 0;
        int z = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int y = 0;
        int[] array = new int[10];
        int[] arr2 = new int[10];
        int[] array2 = {3, 5, 2, 7, 8, 4, 1, 0, 9, 6};
        for (int i = 0; i < array.length; i++)
        {
            q = (int) (Math.random() * n);
            if (q == 0 && z < 1)
            {
                x = 0;
                z = z + 1;
            }
            if (q == 1 && a < 1)
            {
                x = 1;
                a = a + 1;
            }
            if (q == 2 && b < 1)
            {
                x = 2;
                b = b + 1;
            }
            if (q == 3 && c < 1)
            {
                x = 3;
                c = c + 1;
            }
            if (q == 4 && d < 1)
            {
                x = 4;
                d = d + 1;
            }
            if (q == 5 && e < 1)
            {
                x = 5;
                e = e + 1;
            }
            if (q == 6 && f < 1)
            {
                x = 6;
                f = f + 1;
            }
            if (q == 7 && g < 1)
            {
                x = 7;
                g = g + 1;
            }
            if (q == 8 && h < 1)
            {
                x = 8;
                h = h + 1;
            }
            if (q == 9 && y < 1)
            {
                x = 9;
                y = y + 1;
            }
            

            

            array[i] = x;
        }

        for (int j = 0; j < 10; j++)  
        {

            arr2[k] = arr[array2[j]];
            k = k + 1;
        }   
    System.out.println(Arrays.toString(arr2));
    return arr2;
    }






    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
        int[] arr2 = new int[5];
        arr2[2] = arr[3];
        int q = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            q = (int) (Math.random() * 10);
            array[i] = q;
        }
        //System.out.println(Arrays.toString(array));

        //System.out.println(Arrays.toString(arr2));
        //System.out.println(perfectShuffle(arr));
        System.out.println(selectionShuffle(arr));
        //System.out.println(arr[0]);
    }
}
