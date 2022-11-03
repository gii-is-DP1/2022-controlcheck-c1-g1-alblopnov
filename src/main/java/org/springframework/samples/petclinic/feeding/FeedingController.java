package org.springframework.samples.petclinic.feeding;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/feeding")
public class FeedingController {
    
    @Autowired
    private FeedingService feedingService;
    private static final String VIEWS_FORM = "feedings/createOrUpdateFeedingForm";

    @GetMapping(path = "/create")
    public String viewForm(ModelMap map){
        String view = VIEWS_FORM;
        map.addAttribute("feeding", new Feeding());
        map.addAttribute("feedingType", feedingService.getAllFeedingTypes());
        return view;
    }

    @PostMapping(path = "/create")
    public String createFeeding(@Valid Feeding feeding, BindingResult res, ModelMap map){
        String view = "welcome";
        if(res.hasErrors()){
            map.addAttribute("feeding", feeding);
            map.addAttribute("feedingType", feedingService.getAllFeedingTypes());
            return VIEWS_FORM;
        }else{
            feedingService.save(feeding);
            map.addAttribute("message", "Feeding succesfully save");
        }
        return view;
    }
}
