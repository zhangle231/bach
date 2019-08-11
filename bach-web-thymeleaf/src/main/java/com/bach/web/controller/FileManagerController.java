package com.bach.web.controller;

import com.bach.web.model.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 文件管理控制器
 */
@Controller
@RequestMapping("/file-manager")
public class FileManagerController {

    private static final Logger log = LoggerFactory.getLogger(FileManagerController.class);

    @GetMapping(path = "/list")
    public String list(Model model) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        model.addAttribute("test",dateFormat.format(cal.getTime()));
        Address address = new Address("street","code");
        model.addAttribute("address",address);
        log.info("file manager list");
        return "file-manager/list";
    }
}
