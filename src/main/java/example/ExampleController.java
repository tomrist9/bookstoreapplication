package example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/example")
public class ExampleController {
    private UserFeignClient userFeignClient;

    @GetMapping("{id}")
    public User getUser(@PathVariable Long id){
        return  userFeignClient.getUser(id);
    }
}
