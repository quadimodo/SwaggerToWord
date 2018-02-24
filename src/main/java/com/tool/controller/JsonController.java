package com.tool.controller;

import com.tool.dto.Table;
import com.tool.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by XiuYin.Cui on 2018/1/11.
 */
@Controller
public class JsonController {

    @Autowired
    private TableService tableService;

    @RequestMapping("/getJson.html")
    public String getJson(String address ,String port ,Model model){
        Map<String, Object> stringListMap = tableService.tableList(address, port);
        model.addAttribute("mapSum",stringListMap);
        return "json";
    }


}
