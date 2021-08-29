import java.util.*;
class TwoSum{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int arr[] = {1,2,3,4};
        int sum = 7;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    al.add(i);
                    al.add(j);
                    System.out.println(al);
                }
            }
        }
    }
}
