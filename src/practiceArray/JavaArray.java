package practiceArray;

public class JavaArray {
    public static void main(String[] args) {
        JavaArray s1 = new JavaArray();
        s1.printarray();
        s1.frequencyofarray();
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
}
