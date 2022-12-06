import java.util.Arrays;

public class sortingArray{
    public static void main(String[] args) {
        int arrayOne[]={1,0,5,20,2,10,15,17,80,101,1001,5000,5001,200,2010,2011,8};

        String arrayName[]={"Mango","Rayza","Raymond","Pheelady","Adolf","KG","KT","Nathaniel"};

        System.out.println("Original numeric array : "+Arrays.toString(arrayOne));
        Arrays.sort(arrayOne);
        System.out.println("Sorted numeric array : "+Arrays.toString(arrayOne));
    
        System.out.println("Original string array : "+Arrays.toString(arrayName));
        Arrays.sort(arrayName);
        System.out.println("Sorted string array : "+Arrays.toString(arrayName));
        int sum = 0 ;
        for(int i=0 ; i<arrayOne.length ;i++){
            sum+=arrayOne[i];
        }
        System.out.println("The length is "+arrayOne.length);
        System.out.println("The sum is "+sum);
        System.out.println("The avarage is "+sum/arrayOne.length);
    }
}