package lab_1_2;
class Sort
{
public static void main(String args[])
{
    int[] arr={1,5,2,6,2,7,2,1,9,0};

    heapSort(arr);
    System.out.println("HeapSort:");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
}

public static void heapSort(int arr[])
{
    int n=arr.length;
    for(int i= n/2-1;i>=0;i--)
    {
        heapify(arr,i,n);
    }
    for(int i= n - 1;i >=0;i--)
    {
        int temp=arr[i];
        arr[i]=arr[0];
        arr[0]=temp;

        heapify(arr, 0, n);
    }

}
public static void heapify(int[] arr, int i, int n)
{
int left=i*2+1;
int right=i*2+2;
int MaxEl=i;

if(left < n && arr[left] > arr[MaxEl])
MaxEl=left;
if(right < n && arr[right] > arr[MaxEl])
MaxEl=right;
    
if(i != MaxEl)
{
int temp = arr[i];
arr[i]=arr[MaxEl];
arr[MaxEl]=temp;  

heapify(arr, MaxEl, n);
}
}
}
