package assignments.mvc4;

import java.net.http.HttpResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

@RequestMapping(value = "/")
public ModelAndView home(HttpServiceResponse response)
{
   return new ModelAndView("home");
}
    

@RequestMapping(value = "/status", method = RequestMethod.POST)
public ModelAndView status(@ModelAttribute("User") User user)
{

    if(user.getUserName().equals("Shirdi") && user.getPassword().equals("shirdi1241"))
    return new ModelAndView("success");
    return new ModelAndView("error");
    
}
}
