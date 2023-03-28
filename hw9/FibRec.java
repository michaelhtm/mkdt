public class FibRec {
    
    public static long fib(int n){
        if(n<3) return 1;
        else return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args){
        if(args.length<1){
            System.err.println("Include atleast one numebr in command line");
            return;
        }

        long start;
        long end;
        for(String s:args){
            start = System.currentTimeMillis();
            long ans=fib(Integer.parseInt(s));
            end = System.currentTimeMillis();
            System.out.printf("Fib Number %s = %d (%dms)\n",s,ans,end-start);
        }

    }
}
