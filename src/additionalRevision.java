
public class additionalRevision {
    public static void main(String[] args){ // main method to call the other methods
        int[] arr = {6, 0, 6, 6};
        array667(arr);
        stringTimes("Hi",3);
        countXX("xxxx");
        stringMatch("abc", "abc");

    }

    public static String stringTimes(String str, int n){ // Question 1
        String empty = "";
        for(int i = 0; i < n; i++){
            empty = empty + str;
        }
        System.out.println(empty);
        return empty;
    }

    public static int array667(int[] nums){ // Question 2
        int counter = 0;
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] == 6 && nums[i+1] == 6){
                counter = counter + 1;
            }
            if(nums[i] == 6 && nums[i+1] == 7){
                counter = counter + 1;
            }
        }
        System.out.println(counter);
        return counter;
    }


    public static int countXX(String str){ // Question 3
        int counter = 0;
        for(int i = 0; i < str.length()-1 ; i++){
            if(str.substring(i, i+2).equals("xx")){
                counter = counter + 1;
            }
        }
        System.out.println("Counter: " + counter);
        return counter;
    }

    public static int stringMatch(String a, String b){ // Question 4
        int lower = Math.min(a.length(), b.length());
        int counter = 0;
        for(int i = 0; i < lower-1; i++){
            String aSubstring = a.substring(i, i+2);
            String bSubstring = b.substring(i, i+2);

            if(aSubstring.equals(bSubstring)){
                counter = counter+1;
            }
        }
        System.out.println(counter);
        return counter;
    }





}
