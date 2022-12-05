import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    @Autowired
    public MyController(MyService myService){

        System.out.println("MyController constructor has been called");

        this.myService = myService;
    }

    @GetMapping("/")
    public String welcome(){

        return "Welcome!";
    }

    @GetMapping("/getName")
    public String getName(){

        System.out.println("MyService.getName() has been called");
        return myService.getName();
    }


}
