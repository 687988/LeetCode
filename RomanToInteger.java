import java.util.*;
class Main{
    public static void main (String[] args) {
        String s = "IV";
        int arr[] = new int[s.length()];
        for(int i = 0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case 'I':
                    arr[i] = 1;
                    break;
                    
                    case 'V':
                        arr[i] = 5;
                        break;
            }
        }
        int sum = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])// suppose the input is "IIV" then the o/p will 7 it asummes that I and IV that is o/p will be 5
            {
                sum-=arr[i];
            }
            else
            sum +=arr[i];
        }
        System.out.println(sum+arr[arr.length-1]);
    }
}

/*Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000*/
//You can create above symboll and its values in switch
