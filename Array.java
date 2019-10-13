import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main (String [] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(reader.readLine());

        String strings = reader.readLine();
        char [] chars = strings.toCharArray();
        int [] arr = new int[size];

        int c = 0;
        for (int i = 0; i < chars.length; i++ ) {
            if (!(chars[i] == ' ')){
                arr[c] = Integer.parseInt(String.valueOf(chars[i]));
                c++;
            }
        }

        int [] newArr = new int[arr.length];
        int [] newArr2 = new int[arr.length];
        int count = 0;
        int count2 = 0;

        for (int j = 0; j < arr.length ; j++) {
            for (int i = arr.length - 1; i > 0; i--) {
                int a;
                if (arr[i] < arr[i - 1]) {
                    a = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = a;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 3 == 0){
                newArr[count] = arr[i];
                count++;
            }else {
                newArr2[count2] = arr[i];
                count2++;
            }
        }

        for (int i = 0; i < count; i++) {
            arr[i] = newArr[i];
        }

        for (int i = 0; i < count2 ; i++) {
            arr[count+i] = newArr2[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}

