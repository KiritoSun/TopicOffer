package com.zt.base.sort.sort05;

/**
 * 堆排序
 *
 */
public class main {
    public static void main(String[] args) {
        int[] array = new int[]{32, 43, 23, 13, 5};
        System.out.println("初始：");
        show(array);
        heapSort(array);
    }

    public static void heapSort(int[] a){
        int len=a.length;
        for(int i=0;i<len-1;i++){
            System.out.println(i + "次：");
            buildMaxHeap(a,len-1-i);
            show(a);
            swap(a,0,len-1-i);
            show(a);
        }
    }
    private static void swap(int[] data, int i, int j) {
        int tmp=data[i];
        data[i]=data[j];
        data[j]=tmp;
    }
    private static void buildMaxHeap(int[] data, int lastIndex) {
        for(int i=(lastIndex-1)/2;i>=0;i--){
            int k=i;
            while(k*2+1<=lastIndex){
                int biggerIndex=2*k+1;
                if(biggerIndex<lastIndex){
                    if(data[biggerIndex]<data[biggerIndex+1]){
                        biggerIndex++;
                    }
                }
                if(data[k]<data[biggerIndex]){
                    swap(data,k,biggerIndex);
                    k=biggerIndex;
                }else{
                    break;
                }
            }
        }
    }
    private static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
