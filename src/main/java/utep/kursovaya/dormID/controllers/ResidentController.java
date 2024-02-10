package utep.kursovaya.dormID.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import utep.kursovaya.dormID.models.Resident;
import utep.kursovaya.dormID.services.ResidentService;

@Controller
public class ResidentController {
    private final ResidentService residentService;

    public ResidentController(ResidentService residentService) {
        this.residentService = residentService;
    }

    @GetMapping("/")
    public String admin(Model model){
        model.addAttribute("residents", residentService.list());
        return "admin";
    }

    @PostMapping("resident/create")
    public String createResident(Resident resident){
        residentService.saveResident(resident);
        return "redirect:/";
    }

    @PostMapping("/resident/delete/{id}")
    public String deleteResident(@PathVariable Long id){
        residentService.deleteResident(id);
        return "redirect:/";
    }

    @GetMapping("/resident/{id}")
    public String residentInfo(@PathVariable Long id, Model model){
        model.addAttribute("resident", residentService.getResidentById(id));
        return "resident-info";
    }
}
