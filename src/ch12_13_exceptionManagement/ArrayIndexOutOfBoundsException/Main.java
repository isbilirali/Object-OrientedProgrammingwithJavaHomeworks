package ch12_13_exceptionManagement.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

/*
1. Geçilen bir int dizisinin yine geçilen indisindeki elemanını geri
döndüren int getElement(int[] array, int index)
metodunu yazın. Bu metotta fırlatılabilecek
ArrayIndexOutOfBoundsException sıra dışı durumunu yakalayın
ve bu durumu belirtmek üzere metodun -1 döndürmesini sağlayın.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {100,200,300,400,500};

        System.out.println("Which index you need from the array? : ");
        int index  = scanner.nextInt();

        System.out.println(getElement(arr,index));

    }

    private static int getElement(int[] arr, int index) {

        try{
            return arr[index];
        } catch(ArrayIndexOutOfBoundsException e){
            return -1111111111;
        }
    }


}
