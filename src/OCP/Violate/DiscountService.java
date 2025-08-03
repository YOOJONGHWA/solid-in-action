package OCP.Violate;

public class DiscountService {

    public int getDiscountRate(String memberType) {
        if (memberType.equals("Regular")) return 5;
        if (memberType.equals("VIP")) return 20;
        return 0;

        /*
            What's wrong?
            If you keep adding new member types (e.g. Gold, Family), you’ll have to modify the existing if-else block.
            This violates the Open/Closed Principle: the code is closed to extension and requires modification for changes.
        * */
    }
}
