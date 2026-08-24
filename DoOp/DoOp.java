public class DoOp {
    public static String operate(String[] args) {
        if (args == null) {
            return "Error";
        }
        if (args.length<3){
            return "Error";
        }
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[2]);
        switch(args[1]){
            case "+": return String.valueOf(a+b);
            case "-": return String.valueOf(a-b);
            case "*": return String.valueOf(a*b);
            case "/": if (b==0){return "Error";}return String.valueOf(a/b);
            case "%": if (b==0){return "Error";}return String.valueOf(a%b);
            default: return "Error";
        }
    }
}