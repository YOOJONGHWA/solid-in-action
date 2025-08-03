import DIP.EmailSender;
import DIP.MessageSender;
import DIP.NotificationService;
import LSP.RectangleLSP;
import LSP.SquareLSP;
import LSP.Violate.Rectangle;
import LSP.Violate.Square;

import static LSP.Violate.Rectangle.printArea;

public class Main {
    public static void main(String[] args) {
//        Rectangle rect = new Rectangle();
//        printArea(rect, 5, 4);  // 출력 20
//
//        Rectangle square = new Square();
//        printArea(square,5,4);  // 출력 16 → 예상과 다름(LSP 위반)

        RectangleLSP rect = new RectangleLSP(5, 4);
        System.out.println(rect.printArea());

        SquareLSP square = new SquareLSP(4);
        System.out.println(square.printArea());

        MessageSender sender = new EmailSender();  // or new SmsSender();
        NotificationService service = new NotificationService(sender);

        service.notify("Hello!");
    }
}