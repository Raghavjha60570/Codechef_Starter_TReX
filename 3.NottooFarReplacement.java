import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        for (int T = 0; T < t; T++) {
            int n = sc.nextInt();  
            int arr[] = new int[n + 1];

       
            for (int i = 0; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            int last = arr[n]; 

        while(1==1){
            boolean swapped=false;
            for (int i = 0; i < n; i++) {
                if (arr[i] <= 2 * last) {
                    if (arr[i] > last) {
                        int temp = arr[i];
                        arr[i] = arr[n];
                        arr[n] = temp;
                        last = arr[n]; 
                        swapped=true;
                    }
                }
            }
            if(swapped){
                continue;
            }else{
                break;
            }
        }

         
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            // Output the result
            System.out.println(sum);
        }

        sc.close();
    }
}
