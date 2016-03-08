package org.mrpaulwoods.employee.personnel

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

import static org.springframework.web.bind.annotation.RequestMethod.GET

/**
 * Created on 3/7/2016.
 */
@Controller
@RequestMapping(value = "/personnel")
class PersonnelController {

    private final PersonnelRepository personnelRepository

    @Autowired
    PersonnelController(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository
    }

    @RequestMapping(method=GET)
    String index(final Model model) {
        model.addAttribute "people", personnelRepository.findAll()
        "personnel/index"
    }

}