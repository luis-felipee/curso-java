package Secao10;

public class forEach {

    public static void main(String[] args){
        String[] vect = new String[] {"Software engineer", "Deep Learning", "Machine learning"};
        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("--------------------------------");
        for(String obj : vect){
           System.out.println(obj);
        };
    }
}
