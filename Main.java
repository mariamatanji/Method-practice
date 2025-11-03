public class Main
{
    public static int abs(int x){
        int answer = x;
       if (x<0)
            answer = -x;
            return answer;

    }
    public static void helloWorld(){
        System.out.println("Hello world");
    }
    
    
    
	public static void main(String[] args) {
	    int value = abs(-101);
		System.out.println("Value is "+ value);
		
		
	}
}
