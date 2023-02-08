public class demenagement {

    public static void moveCarton()  {
        int carton = 34;
        int trajet = 9;
        while (carton > 0) {
            carton -= trajet;
            if (carton < 9) {
                trajet = carton;
            }
            System.out.println(trajet);
        }
    }

    public static void main(String[] args) {
        moveCarton();
    }
}
