public class Soal2 {

    public static class Room {
        private String roomNumber;
        private double pricePerNight;

        public Room(String roomNumber, double pricePerNight) {
            this.roomNumber = roomNumber;
            this.pricePerNight = pricePerNight;
        }

        public String getRoomNumber() {
            return roomNumber;
        }

        public double getPricePerNight() {
            return pricePerNight;
        }
    }

    public static class Guest {
        private String name;
        private Reservation reservation;

        public Guest(String name, Reservation reservation) {
            this.name = name;
            this.reservation = reservation;
        }

        public String getName() {
            return name;
        }

        public Reservation getReservation() {
            return reservation;
        }
    }

    public static class Reservation {
        private Room room;
        private Guest guest;
        private int numberOfNights;

        public Reservation(Room room, Guest guest, int numberOfNights) {
            this.room = room;
            this.guest = guest;
            this.numberOfNights = numberOfNights;
        }

        public Room getRoom() {
            return room;
        }

        public Guest getGuest() {
            return guest;
        }

        public int getNumberOfNights() {
            return numberOfNights;
        }

        public double calculateTotalPrice() {
            return room.getPricePerNight() * numberOfNights;
        }
    }

    public static void main(String[] args) {
        Room room = new Room("101", 500000);

        Guest guest = new Guest("John Doe", null);

        Reservation reservation = new Reservation(room, guest, 3);
        guest = new Guest(guest.getName(), reservation);

        System.out.println("Guest Name: " + guest.getName());
        System.out.println("Room Number: " + reservation.getRoom().getRoomNumber());
        System.out.println("Number of Nig   hts: " + reservation.getNumberOfNights());
        System.out.println("Total Price: " + reservation.calculateTotalPrice());
    }
}
    