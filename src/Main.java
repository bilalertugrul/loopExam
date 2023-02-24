import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
        int inputNumber, sum=0, count=0, average;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        inputNumber = input.nextInt();

        for(int i = 1 ; i<=inputNumber ; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                count++;
                sum+=i;
            }
        }
        average = sum/count;
        System.out.println("Ortalama : " + average);
    }
}