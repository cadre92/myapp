@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(Authentication auth) {
        return "Hello " + (auth != null ? auth.getName() : "anonymous");
    }
}
