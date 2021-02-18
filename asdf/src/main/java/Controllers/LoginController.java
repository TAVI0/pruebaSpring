package Controllers;


import form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {

    //to get login form page
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    //@GetMapping("/login")
    public String getLoginForm(){
        //return html page name
        return "login";
    }


    //checking form login credentials
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    //@PostMapping("/login")
    public String login(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model){
        String id = loginForm.getId();
        String password = loginForm.getPassword();

        if (id.equals("1") && password.equals("1234")){
            return "home";
        }
        return "login";
    }

}
