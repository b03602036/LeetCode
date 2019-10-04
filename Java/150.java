class solution{

//150. Evaluate Reverse Polish Notation
    //6 ms, faster than 79.82%
    public static int evalRPN(String[] tokens) {
        Stack<Integer> intstack = new Stack<>();
        int n = tokens.length;
        int ret = 0;
        for(int i = 0 ; i < n ; i ++){

                switch(tokens[i]){
                    case "+":{
                        int a = intstack.pop();
                        int b = intstack.pop();
                        intstack.push(b + a);
                        System.out.println(intstack.toString());
                        break;
                    }
                    case "-":{
                        int a = intstack.pop();
                        int b = intstack.pop();
                        intstack.push(b - a);
                        System.out.println(intstack.toString());
                        break;

                    }
                    case "*":{
                        int a = intstack.pop();
                        int b = intstack.pop();
                        intstack.push(b * a);
                        System.out.println(intstack.toString());
                        break;
                    }
                    case "/":{
                        int a = intstack.pop();
                        int b = intstack.pop();
                        intstack.push(b / a);
                        System.out.println(intstack.toString());
                        break;
                    }
                    default:{
                        int m = Integer.parseInt(tokens[i]);
                        intstack.push(m);
                        System.out.println(intstack.toString());
                        break;
                }
            }
        }

        ret = intstack.peek();
        return ret;
    }
}
