public class StringBuilders {
    public static void main(String args[]){
//        StringBuilder sb= new StringBuilder("java");
//        System.out.println(sb);
//    // setAt function use
//        sb.setCharAt(0,'p');
//        System.out.println(sb);// this is use to change value inside the string
//  // insert function use
//        sb.insert(0,'N');
//        System.out.println(sb);
//        // delete function
//        sb.delete(0,3);
//        System.out.println(sb);

//        // append function
//        StringBuilder sb=new StringBuilder("h");
//        sb.append("e");
//        sb.append("l");
//        sb.append("l");
//        sb.append("o");
//        System.out.println(sb);
        // write a code to reverse string value
        StringBuilder sc=new StringBuilder("java");
        for (int i=0;i<sc.length()/2;i++){

            int front=i;
            int back=sc.length()-1-i;

            char frontChar=sc.charAt(front);
            char backChar=sc.charAt(back);

            sc.setCharAt(front,backChar);
            sc.setCharAt(back,frontChar);

        }
        System.out.println(sc);
    }
}
