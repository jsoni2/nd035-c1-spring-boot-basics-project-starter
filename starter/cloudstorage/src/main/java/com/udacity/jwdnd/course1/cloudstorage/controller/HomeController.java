package com.udacity.jwdnd.course1.cloudstorage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

//    private MessageListService messageListService;

//    public HomeController(MessageListService messageListService) {
//        this.messageListService = messageListService;
//    }

    public HomeController() {

    }

    @GetMapping
    public String getHomePage() {
//        model.addAttribute("greetings", this.messageListService.getMessages());
        return "home";
    }

//    @PostMapping("/home")
//    public String addMessage(@ModelAttribute("newMessage") MessageForm messageForm, Model model) {
//        messageListService.addMessages(messageForm.getText());
//        model.addAttribute("greetings", messageListService.getMessages());
//        messageForm.setText("");
//        return "home";
//    }
}
