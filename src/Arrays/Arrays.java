package Arrays;

public class Arrays {
//    public void sum() {
//        int[] A = {3,9,7,8,12,6,15,5,4,10};
//        int ans = 0;
//        for(int x:A) {
//            ans = ans + x;
//        }
//        System.out.println(ans);
//    }

//    public void search() {
//        int[] A = {3,9,7,8,12,6,15,5,4,10};
//        int search = 6;
//        for(int i=0;i<A.length;i++) {
//            if(A[i]==search){
//                System.out.println("Number found at index "+i);
//                System.exit(0);
//            }
//        }
//        System.out.println("Number not found ");
//    }
//
//    public void max() {
//        int[] A = {3,9,7,8,12,6,15,5,4,10};
//        int max=A[0];
//        for(int i=0;i<A.length;i++) {
//            if(A[i]>max){
//                max=A[i];
//            }
//        }
//        System.out.println("Maximum number is "+max);
//    }

    public void secondLargest() {
        int[] A = {3,9,7,8,12,6,15,5,4,10};
        int max1, max2;
        max1=max2=A[0];
        for(int i=0;i<A.length;i++) {
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            } else if(A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println("Second largest element is "+max2);
    }

    public void rotateLeft() {
        int[] A = {3,9,7,8,12,6,15,5,4,10};
        int temp = A[0];
        for(int x:A) {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int x:A) {
            System.out.print(x+" ");
        }
    }


    public void rotateRight() {
        int[] A = {3,9,7,8,12,6,15,5,4,10};
        int temp = A[A.length-1];
        for(int x:A) {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i=A.length-1;i>0;i--){
            A[i]=A[i-1];
        }
        A[0]=temp;
        for(int x:A) {
            System.out.print(x+" ");
        }
    }

    public void insert() {
        int[] A = new int[10];
        A[0]= 5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        int y=15;
        int index=2;
        for(int x:A) {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i=A.length-1;i>index;i--){
            A[i]=A[i-1];
        }
        A[2]=y;
        for(int x:A) {
            System.out.print(x+" ");
        }
    }

    public void delete() {
        int[] A = new int[10];
        A[0]= 5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        int index=2;
        for(int x:A) {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i=index+1;i<A.length;i++){
            A[i-1]=A[i];
        }
        for(int x:A) {
            System.out.print(x+" ");
        }
    }

    public void copy() {
        int[] A = {3,9,7,8,12,6,15,5,4,10};
        int[] C = new int[10];
        for(int x:A) {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i=0;i<A.length;i++) {
            C[i]=A[i];
        }
        for(int x:C) {
            System.out.print(x+" ");
        }
    }

    public void revCopy() {
        int[] A = {3,9,7,8,12,6,15,5,4,10};
        int[] C = new int[10];
        int i,j;
        for(int x:A) {
            System.out.print(x+" ");
        }
        System.out.println();
        for(i=A.length-1,j=0;i>=0;i--,j++)
        {
            C[j]=A[i];
        }
        for(int x:C) {
            System.out.print(x+" ");
        }
    }

    // Increasing Size of Array
    public void increase() {
        int[] A = {3,9,7,8,12};
        int[] B = new int[10];
        System.out.println(A.length);
        for(int i=0;i<A.length;i++) {
            B[i]=A[i];
        }
        A=B;
        B=null;
        System.out.println(A.length);
        System.out.println(B.length);
    }

    public void addMatrix() {
        int[][] A = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] B = {{1,5,2},{6,8,4},{3,9,7}};
        int[][] C = new int[3][3];
        for(int i=0;i< A.length;i++) {
            for(int j=0;j<A[0].length;j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
        }
    }

    public void mulMatrix() {
        int[][] A = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] B = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] C = new int[3][3];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++){
                C[i][j]=0;
                for(int k=0;k<3;k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        for(int[] x: C){
            for(int y:x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
