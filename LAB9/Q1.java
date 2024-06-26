import java.util.Scanner;

class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        int c=countChar(str);
        int w=countWord(str);
        int l=countLines(str);
        int v=countVowel(str);
        System.out.println("Number of characters: "+c);
        System.out.println("Number of words: "+w);
        System.out.println("Number of lines: "+l);
        System.out.println("Number of vowels: "+v);
    }

    public static int countChar(String text){
        String newLine=text.replaceAll("\n", "");
        return newLine.length();
    }
    public static int countWord(String text){
        String nL[]=text.split("\\s+");
        return nL.length;
    }
    public static int countLines(String text){
        int i;
        int c=0;
        //text.toCharArray();
        for (i=0;i<text.length();i++){
            if (text.charAt(i)=='.'){
                c++;
            }
        }
        return c;
    }
    public static int countVowel(String text){
        int c=0;
        String LowerCase=text.toLowerCase();

        for (char ch: LowerCase.toCharArray()){
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                c++;
            }
        }
        return c;
    }
}