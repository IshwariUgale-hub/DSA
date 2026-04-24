

public class EasyLevelDSA {
    
   // Reverse String Function
    public static String reverse(String s){
          char arr[]=s.toCharArray();
          int i=0;
          int j=arr.length-1;
          char temp;
          while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
          }

          return new String(arr);
    }

    //Array Sort or not checking Function
    public static void isArraySort(int a[]){
      Boolean flag=true;
      int arr[]=a;
      for(int i=0; i<arr.length-1; i++){
        if(arr[i]>arr[i+1]){
          flag =false;
        }
      }
       if(flag==true){
          System.out.println("Array is sorted!");
       }
       else{
        System.out.println("Array is not sorted");
       }
          
    }


    //Find Minimun and Maximum value in Array
    public static void minmax(int arr[]){
      int min=arr[0],max=arr[0];

      for(int i=0; i<arr.length-1;i++ ){
        if(min>arr[i]){
          min=arr[i];
        }
        if(max<arr[i]){
          max=arr[i];
        }
      }
      System.out.println("MIN : "+min+"\nMAX : "+max);

    }


    public static void main(String args[]){
       
       // REverse String
       System.out.println(reverse("HELLO"));
       System.out.println(reverse("ISHWARI Ugale"));


        //Check Array is sort or not
        int a[]={4,7,9,90,11,2,68};
        isArraySort(a);

        //Check min and max of array a
        minmax(a);
        

    }
}
