package ppkwu.rest_rev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(path = "/revertString")
    public String reverseString(@RequestParam(value = "input", required = false) String input){

        StringBuilder revertedString = new StringBuilder();

        revertedString.append(input);
        revertedString = revertedString.reverse();

        return revertedString.toString();
    }

}
