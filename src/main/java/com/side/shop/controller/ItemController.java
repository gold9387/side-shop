package com.side.shop.controller;

import com.side.shop.domain.item.Salad;
import com.side.shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/items/new")
    public String createForm(Model model) {
        model.addAttribute("form", new SaladForm());
        return "items/createItemForm";
    }

    @PostMapping("/items/new")
    public String create(Salad form) {
        Salad salad = new Salad();
        salad.setName(form.getName());
        salad.setPrice(form.getPrice());
        salad.setStockQuantity(form.getStockQuantity());
        salad.setMain(form.getMain());

        itemService.saveItem(salad);
        return "redirect:/";
    }
}
