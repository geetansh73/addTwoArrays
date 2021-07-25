class addtwoarray
{
public static void main(String geetu[])
{
int arr1[][]={{1,2},{3,4}};
int arr2[][]={{1,2},{3,4}};
int arr3[][]=new int[2][2];
for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr1[i].length;j++)
{
arr3[i][j]=arr1[i][j]+arr2[i][j];
}
}
for(int i=0;i<arr3.length;i++)
{
for(int j=0;j<arr3[i].length;j++)
{
System.out.print(arr3[i][j]+" ");
}
System.out.println();
}
}
}
