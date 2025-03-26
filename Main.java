public class Switchcase {
    public static void main(String[] args) {
        int n = 4;
        
        switch(n) {  // Enclose switch cases inside {}
            case 1:
                System.out.println("Monday");
                break;
                
            case 2:
                System.out.println("Tuesday");
                break;
                
            case 3:
                System.out.println("Wednesday");
                break;
                
            case 4:
                System.out.println("Thursday"); // Fixed spelling
                break;
                
            case 5:
                System.out.println("Saturday"); // Fixed spelling
                break;
                
            case 6:
                System.out.println("Friday");
                break;
                
            case 7:
                System.out.println("Sunday");
                break;
                
            default:
                System.out.println("Out of range");
                break;
        }
    }
}
