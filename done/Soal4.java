public class Soal4{

public static class Movie {
    private String title;
    private int duration;
    private String rating;

    public Movie(String title, int duration, String rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }
}

public static class Seat {
    private String seatNumber;
    private boolean isAvailable;

    public Seat(String seatNumber, boolean isAvailable) {
        this.seatNumber = seatNumber;
        this.isAvailable = isAvailable;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

public static class Reservation {
    private String reservationId;
    private Movie movie;
    private Seat seat;

    public Reservation(String reservationId, Movie movie, Seat seat) {
        this.reservationId = reservationId;
        this.movie = movie;
        this.seat = seat;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Seat getSeat() {
        return seat;
    }

    public void reserveSeat() {
        if (seat.isAvailable()) {
            seat.setAvailable(false);
            System.out.println("Reservasi berhasil no: " + seat.getSeatNumber());
        } else {
            System.out.println("Seat " + seat.getSeatNumber() + " is already reserved.");
        }
    }

}
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 148, "PG-13");

        Seat seat = new Seat("A12", true);

        Reservation reservation = new Reservation("R001", movie, seat);

        //reservation.reserveSeat();  
        System.out.println("Kursi Tersedia?" + seat.isAvailable());
    }
}
