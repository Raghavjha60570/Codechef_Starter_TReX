import java.util.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();  
            int m = sc.nextInt();  
            
            String sA = sc.next();  
            String sB = sc.next();  
            
            Set<Character> setA = new HashSet<>();
            
            Set<Character> setB = new HashSet<>(); 
            
            
            for (char c : sA.toCharArray()) {
                setA.add(c);
            }
            
            
            for (char c : sB.toCharArray()) {
                setB.add(c);
            }
            
            boolean validNameExists = false;
            
            
            for (char c = 'a'; c <= 'z'; c++) {
                if (!setA.contains(c) && !setB.contains(c)) {
                    validNameExists = true;
                    break;
                }
            }
            
           
            if (validNameExists) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

