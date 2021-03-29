package com.example.demo.controller;

import com.example.demo.BaseController;
import com.example.demo.model.dto.DemoTableDTO;
import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("")
public class DemoController  extends BaseController {
    private final DemoService demoService;

    @GetMapping(value = "selectAll")
    public List<DemoTableDTO> selectAll() {
        return demoService.selectAll();
    }

    @GetMapping(value = "insert")
    public void insert(@RequestParam String name,@RequestParam String tel) {
        demoService.insert(name, tel);
    }

    @GetMapping(value = "delete")
    public void delete(@RequestParam Integer oid) {
        demoService.delete(oid);
    }
}

