public class ArrayAddition {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < 5; i++)

        {
            int sum = 0;
            sum = sum + arr[i];

            System.out.println("index is" + i);
            System.out.println("value at index" + arr[i]);
            System.out.println("Added " + sum);
        }

        // System.out.println(Arrays.toString(arr));
    }
}
