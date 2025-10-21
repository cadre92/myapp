@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username) {
        return ResponseEntity.ok(jwtService.generateToken(username));
    }
}
