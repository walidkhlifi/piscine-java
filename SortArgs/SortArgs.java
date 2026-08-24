import java.util.Arrays;
public class SortArgs {
    public static void sort(String[] args) {
        int[] newArray=new int[args.length];
        int index=0;
        for (String v : args){
            newArray[index]=Integer.parseInt(v);
            index++;
        }

        Arrays.sort(newArray);
        for (int i=0; i<newArray.length ; i++){
            System.out.print(newArray[i]);
            if (i<newArray.length-1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}