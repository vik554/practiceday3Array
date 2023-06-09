package practiceArray;

public class JavaArray {
    public static void main(String[] args) {
        JavaArray s1 = new JavaArray();
        s1.printarray();
        s1.frequencyofarray();
        s1.largestelement();
        s1.smallestelement();
        s1.even_positon();
        s1.Odd_position();


    }

    public void printarray() {
        char[] arr = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void frequencyofarray() {
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 1, 3, 4, 5, 5, 5};

        int[] frequencyArr = findFrequency(arr);

        for (int i = 0; i < frequencyArr.length; i++) {
            if (frequencyArr[i] > 0) {
                System.out.println("Element " + (i + 1) + " occurs " + frequencyArr[i] + " times");
            }
        }
    }

    public static int[] findFrequency(int[] arr) {
        int[] frequencyArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            if (frequencyArr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        frequencyArr[j] = -1;
                    }
                }
                frequencyArr[i] = count + 1;
            }
        }
        return frequencyArr;
    }

    public void largestelement() {
        int max = 0;
        int a[] = {44, 3, 6, 55, 43, 22};
        for (int i = 0; i < a.length; i++)
            max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum value in the array is:" + max);
    }

    public void smallestelement() {
        int min = 0;
        int a[] = {44, 3, 6, 55, 43, 22};
        for (int i = 0; i < a.length; i++)
            min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Minimum value in the array is:" + min);
    }

    public void even_positon() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        System.out.println("Elements at even positions:");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }

    public void Odd_position() {
        int arr[] = {56, 65, 44, 565, 64, 464, 46, 46};
        System.out.println("elemennt at odd possition are : ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}





