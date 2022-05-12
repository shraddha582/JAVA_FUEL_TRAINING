class ArraySquare
{
public static void main(String[] args)
{
int i;
int v=0;
int arr[]=new int[5];
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;

for(i=0;i<arr.length;i++)
{
v=arr[i]*arr[i];
System.out.println(""+v);
}
}
}
