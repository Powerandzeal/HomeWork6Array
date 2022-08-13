public class Main {
    public static void main(String[] args) {
        ex1();
    }

    //Задача номер 1
    public static void ex1() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        long[] arr3 = {2323223l, 5463633l, 54534342677l};
        //Задача номер 2
        for (int i=0; i< arr1.length; i++) {
            if (i == 2) {
                System.out.print(" " + arr1[i]);
            } else {
                System.out.print(" " + arr1[i] + ",");
            }
        }
        System.out.println();

        for (int b=0; b< arr2.length; b++) {
            if (b == 2) {
                System.out.print(" " + arr2[b]);
            } else System.out.print(" " + arr2[b] + ",");

        }
        System.out.println();
        for (int a=0; a< arr3.length; a++) {
            if (a == 2) {
                System.out.print(" " + arr3[a]);
            } else {
                System.out.print(" " + arr3[a] + ",");
            }

        }
        System.out.println();

        // Задача  номер 3
        for (int e=arr1.length-1; e>=0; e--) {
            if (e == 0) {
                System.out.print(" " + arr1[e]);
            } else {
                System.out.print(" " + arr1[e] + ",");
            }

        }
        System.out.println();
        for (int k = arr2.length-1; k >=0; k--) {
            if (k == 0) {
                System.out.print(" " + arr2[k]);
            } else System.out.print(" " + arr2[k] + ",");

        }
        System.out.println();
        for (int d = arr3.length-1; d >=0; d--) {
            if (d == 0) {
                System.out.print(" " + arr3[d]);
            } else System.out.print(" " + arr3[d] + ",");

        }
        System.out.println();
        //Четвертая задача
        for (int x = 0; x <= 2; x++) {

            if (x % 2 != 0) {

                System.out.print(arr1[x] + ", ");

            } else {
                System.out.print(arr1[x]+1 + " ,");
            }


        }


    }
}
