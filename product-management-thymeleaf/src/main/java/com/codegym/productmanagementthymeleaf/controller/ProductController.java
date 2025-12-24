package com.codegym.productmanagementthymeleaf.controller;


import com.codegym.productmanagementthymeleaf.model.Product;
import com.codegym.productmanagementthymeleaf.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final IProductService productService = new ProductService();

    // Bước 6: danh sách
    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    // Bước 7: tạo mới
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/save")
    public String save(Product product) {
        product.setId((int)(Math.random() * 10000));
        productService.save(product);
        return "redirect:/products";
    }

    // Bước 8: cập nhật
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/products";
    }

    // Bước 9: xoá
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Product product) {
        productService.remove(product.getId());
        return "redirect:/products";
    }

    // Bước 10: xem chi tiết
    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "view";
    }

    // Bước 11: tìm kiếm
    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        model.addAttribute("products", productService.searchByName(name));
        return "index";
    }
}

