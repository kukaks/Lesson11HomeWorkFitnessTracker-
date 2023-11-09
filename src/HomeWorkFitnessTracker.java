    public class HomeWorkFitnessTracker {
        public static void main(String[] args) {


            User user1 = new User("Alice", 12, 3, 1998, "alice@example.com", "+1234567890");
            user1.setLastName("Smith");
            user1.setWeight(65.5);
            user1.setBloodPressure("120/80");
            user1.setStepsPerDay(10000);

            User user2 = new User("Bob", 25, 6, 2000, "bob@example.com", "+9876543210");
            user2.setLastName("Johnson");
            user2.setWeight(75.2);
            user2.setBloodPressure("130/90");
            user2.setStepsPerDay(8000);

            User user3 = new User("Charlie", 5, 9, 1995, "charlie@example.com", "+1112233444");

            user1.printAccountInfo();
            user2.printAccountInfo();
            user3.printAccountInfo();

            // Оновлення даних користувачів
            user1.setLastName("Johnson");
            user1.setWeight(75);
            user1.setBloodPressure("122/78");
            user1.setStepsPerDay(12000);

            user2.setLastName("Smith");
            user2.setWeight(85);
            user2.setBloodPressure("131/88");
            user2.setStepsPerDay(9000);

            System.out.println("\nОновлені дані користувачів:\n");

            user1.printAccountInfo();
            user2.printAccountInfo();

        }


    }


