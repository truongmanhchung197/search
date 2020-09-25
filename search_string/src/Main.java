import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ki: ");
        String str = input.nextLine();
        LinkedList<Character> linkedList=new LinkedList<>();
        for (int i=0;i<str.length();i++){
            LinkedList<Character> max = new LinkedList<>();
            max.add(str.charAt(i));
            for (int j=i+1;j<str.length();j++){
                if (str.charAt(j)>max.getLast()){
                    max.add(str.charAt(j));
                }
            }
            if (max.size()>linkedList.size()){
                linkedList.clear();
                linkedList.addAll(max);
            }
            max.clear();
        }
        System.out.println("Chuoi ki tu phu duoc sap xep lon nhat: ");
        for (Character ch:linkedList){
            System.out.print(ch);
        }
    }
}
