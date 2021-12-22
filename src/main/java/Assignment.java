import java.util.Scanner;

class Reverse{
    public String stringrev(String name){
        String rev="";
        char ch;

        System.out.println(name);

        for(int i=0;i<name.length();i++){
            ch = name.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
        return rev;

    }
}

public class Assignment {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        Reverse obj = new Reverse();
        obj.stringrev(name);

    }
}
