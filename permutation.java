package backtracking;

public class permutation {
    public static void permutation(String str,String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            String str1= str.substring(0, i)+str.substring(i+1,str.length());
            permutation(str1,ans+ch);
        }  
    }
    public static void main(String[] args) {
        String str ="abc";
        permutation(str,"");
    }
}
