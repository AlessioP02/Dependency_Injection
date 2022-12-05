import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(String myComponentName){

        this.myComponentName = myComponentName;
    }

    public String getMyComponentName() {
        return myComponentName;
    }
}
