package week04_a.cinema;

public class Demo {
    public static void main(String[] args) {


        String array[][]={{"One","Two","Three","Four"},{"One","Two","Three","Four"},{"One","Two","Three","Four"}};

        for(String var[]:array)
            for(String str:var)
            System.out.println(str);

        Cinema cinema=new Cinema();
//        System.out.println(cinema.seats);
//        System.out.println(cinema.seats[0]);
//        System.out.println(cinema.seats[0][0]);
//        cinema.displaySeats();

//        System.out.println("Total seats:"+cinema.countAvailableSeats());
//
//
//        UtilityClass.displaySeats(cinema.seats);
    }
}
