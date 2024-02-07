/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elemiprogtetelek;

import java.util.Scanner;

/**
 *
 * @author LajkóGergő(SZOFT_202
 */
public class ElemiProgTetelek {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("szám: ");
        int s =sc.nextInt();
        System.out.println("s= " + s);
        //Összegés:
        int n = 4;
        while (n < 0) {

        }
        int ossz = 0;
        for (int i = 0; i < n + 1; i++) {
            ossz+=i;
        }
        //System.out.println("Az első n db szám sösszege: " +ossz);
        System.out.printf("Az első %d db szám összege: %d\n", n, ossz);
        

        //Megszámolás:
        int db = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0) {
                db++;
            }
        }
        System.out.printf("Kétjegyű párosok száma: %d\n", db);
        
        //Minimum kiválsaztás
        int VEGE =0;
        db=0;
        int min=Integer.MAX_VALUE;// 2147483647;
        int szam=0;
        System.out.print(VEGE+"-re kilép: ");
        while( (szam=sc.nextInt()) != VEGE )
        {
            if (szam < min){
                min = szam;
            }
            db ++;
        }
        System.out.printf("%d szából a legkisebb: %d", db, min);

    }//main vége

}//calss vége
