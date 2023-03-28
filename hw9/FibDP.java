public class FibDP{

    private static long[] table;

    public static void computeTable(int n){
        table=new long[n];
        table[0]=1;
        table[1]=1;
        for(int i=2; i<n; i++){
            table[i]=table[i-1]+table[i-2];
        }
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
            int n=Integer.parseInt(s);
            if(table==null || n>table.length) computeTable(n);
            end = System.currentTimeMillis();
            System.out.printf("Fib Number %s = %d (%dms)\n",s,table[n-1],end-start);
        }

    }
}