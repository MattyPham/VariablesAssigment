public class VariablesAndNames
{
    public static void main( String[] args )
    {
        //Problem 1
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );

        System.out.println("---------------------------------------------------------------");
        //Problem 2
        int room = 113;
        double round = 2.71828;
        String cs = "Computer Science";
        System.out.println("The room " + room + " is located somewhere on the first floor of Windermere Secondary.");
        System.out.println("The number " + round + " would typically round up to the number 3.");
        System.out.println("I learning about " + cs + "in my Programming 11 class.");

        System.out.println("---------------------------------------------------------------");
        //Problem 3
        String block1 = "1-1";
        String block2 = "1-2";
        String block3 = "1-3";
        String block4 = "1-4";
        String tblock1 = "2-1";
        String tblock2 = "2-2";
        String tblock3 = "2-3";
        String tblock4 = "2-4";
        String subject1 = "Fitness and Conditioning 11";
        String subject2 = "Physics 11";
        String subject3 = "Senior Concert Band";
        String subject4 = "Law 12";
        String subject21 = "English 11";
        String subject22 = "Programming 11";
        String subject23 = "Introductory Mandarin 11";
        String subject24 = "Pre-Calculus 11";
        String teacher1 = "Brad White";
        String teacher2 = "Randy Jung";
        String teacher3 = "Gord Robertson";
        String teacher4 = "Donna Lee";
        String teacher21 = "Timothy Ross";
        String teacher22 = "Paul Zaremba";
        String teacher23 = "Helen Zhang";
        String teacher24 = "David Tam";

        System.out.println("------------------------------------------------------------------");
        System.out.println("| " + block1 + " |  " + subject1 + "          |  " + teacher1 + "      |");
        System.out.println("| " + block2 + " |  " + subject2 + "                           |  " + teacher2 + "      |");
        System.out.println("| " + block3 + " |  " + subject3 + "                  |  " + teacher3 + "  |");
        System.out.println("| " + block4 + " |  " + subject4 + "                               |  " + teacher4 + "       |");
        System.out.println("| " + tblock1 + " |  " + subject21 + "                           |  " + teacher21 + "    |");
        System.out.println("| " + tblock2 + " |  " + subject22 + "                       |  " + teacher22 + "    |");
        System.out.println("| " + tblock3 + " |  " + subject23 + "             |  " + teacher23 + "     |");
        System.out.println("| " + tblock4 + " |  " + subject24 + "                      |  " + teacher24 + "       |");
        System.out.println("------------------------------------------------------------------");

    }

}

