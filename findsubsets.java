package backtracking;

public class findsubsets {
    public static void subsets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
            return;   
        }
        //recurssion
        //yes
        subsets(str, ans+str.charAt(i), i+1);
        //no
        subsets(str, ans, i+1);  
    }
    public static void main(String[] args) {
        String str ="abc";
        subsets(str, "", 0);
    }

}
