package steem;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by uitschool JV on 12/11/2015.
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name :");
        String a = scan.next();
        File file = new File(a);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (Exception e) {
            System.out.println("File cannot be created");
            e.printStackTrace();//сообщение об ошибке
        }

        byte[] arr = new byte[1024];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = (byte) r.nextInt(127);
        }

        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();

        try {
            OutputStream os = new FileOutputStream(file);
                byteOutput.write(arr,0,arr.length);
            try {
                byteOutput.writeTo(os);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
           BufferedReader br = new BufferedReader (new FileReader(file));
            try {
                System.out.println(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
