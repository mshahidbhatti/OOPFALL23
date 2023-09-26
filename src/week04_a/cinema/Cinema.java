package week04_a.cinema;

public class Cinema {
    Seat seats[][]=new Seat[5][];
    //Seat seats[][][]=new Seat[3][][];


    Cinema(){

        seats[0]=new Seat[4];
        seats[1]=new Seat[10];
        seats[2]=new Seat[15];
        seats[3]=new Seat[20];
        seats[4]=new Seat[25];


        int counter=1;
        for(int j=0;j<seats.length;j++)
        for(int i=0;i<seats[j].length;i++) {
            String seatID=String.format("%03d",counter++);
            seats[j][i] = new Seat(seatID, "premium",
                    "green", 5000, false);
        }

    }


    public void displaySeats(){
        for(Seat[] temp:seats)
            for(Seat seat:temp)
                System.out.println(seat);

//        for(int j=0;j<seats.length;j++)
//            for(int i=0;i<seats[j].length;i++)
//                System.out.println(seats[j][i]);
    }

    public int countAvailableSeats(){
        int counter=0;
        for(int j=0;j<seats.length;j++)
            for(int i=0;i<seats[j].length;i++)

                if(!seats[j][i].reserved)
                    counter++;
            return  counter;
    }



    public Seat[][] getSeats(){
        return seats;
    }



}
