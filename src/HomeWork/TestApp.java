package HomeWork;

import java.util.*;

public class TestApp {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        List<Movie> list=new ArrayList<>();
        Movie movie=new Movie(2002);
        Movie movie1=new Movie(2008);
        Movie movie2=new Movie(2003);
        Movie movie3=new Movie(2005);
        list.add(movie);
        list.add(movie1);
        list.add(movie2);
        list.add(movie3);
        Iterator<Movie> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().getYear()+" ");
        }
        System.out.println();
        Collections.sort(list);
        Iterator<Movie> iterator1=list.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next().getYear()+" ");
        }*/
        /*PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(4);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

*/
        Random r=new Random();
        ArrayList<Movie> list = new ArrayList<>();
        for(int i=0;i<20;i++){
            list.add(new Movie(r.nextInt(120)));
        }

      /*  list.add((new Movie(132)));
        list.add(new Movie(119));
        list.add((new Movie(115)));
        list.add((new Movie(117)));
        list.add((new Movie(128)));*/

        for (Movie m : list) {
            System.out.print(m.getYear() + " ");
        }
        Collections.sort(list);
        System.out.println();
        for (Movie m : list) {
            System.out.print(m.getYear() + " ");
        }
        ArrayList<Movie> oddList = new ArrayList<>();
        ArrayList<Movie> evenList=new ArrayList<>();
       for(int i=0;i<list.size();i++){
           if(list.get(i).getYear()%2!=0){
               oddList.add(list.get(i));
           }else{
               evenList.add(list.get(i));
           }
       }
        System.out.println();
        System.out.println("Odd List");
       for (Movie i:oddList){
           System.out.print(i.getYear()+" ");
       }
        System.out.println();
        System.out.println("Even List");
       for (Movie i1:evenList){
           System.out.print(i1.getYear()+" ");
       }
    }
}
