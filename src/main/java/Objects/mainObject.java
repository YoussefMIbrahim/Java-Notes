package Objects;

public class mainObject {

    public static void main(String[] args) {

        Pool ymca = new Pool("YMCA Downtown Minneapolis", 50, true);

        System.out.println(ymca);
        System.out.println("can swim during winter? " + ymca.caSwimInWinter());

        Pool comoPark = new Pool("Como Park", 25, true);
        System.out.println(comoPark);
        System.out.println("can swim during winter? " + comoPark.caSwimInWinter());

        Pool edina = new Pool("Edina", 50, false);
        System.out.println(edina);
        System.out.println("can swim during winter? " + edina.caSwimInWinter());

        double comoDistance = comoPark.distanceForLaps(10);
        System.out.println(comoDistance);

        double edinaDistance = edina.distanceForLaps(12);
        System.out.println(edinaDistance);

    }
}
