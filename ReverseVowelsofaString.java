import java.util.Scanner;

public class ReverseVowelsofaString {
	public static String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        char[] store=s.toCharArray();
        while(start<end){
            if(!isVowel(store[start])){
                start++;
                continue;
            }
            if(!isVowel(store[end])){
                end--;
                continue;
            }
            char c=store[start];
            store[start]=store[end];
            store[end]=c;
            start++;
            end--;

        }
        
        return String.valueOf(store);
    }
    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') return true;
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(reverseVowels(s));
			
	}


	}


//O(N)
//O(1)


