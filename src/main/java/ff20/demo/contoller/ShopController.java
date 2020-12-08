package ff20.demo.contoller;

import ff20.demo.repository.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    private ItemRepository itemRepository;

    public ShopController(ItemRepository itemRepository){ this.itemRepository = itemRepository;}

    @GetMapping("/shop")
    public String shop(Model model){

        model.addAttribute("items", itemRepository.findAll());

        return "shop";
    }


}