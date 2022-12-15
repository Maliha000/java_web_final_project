package com.example.java_web_final_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/wonder")
public class WondersOfWorldController {

    private WondersOfWorldService wondersOfWorldService;

    public WondersOfWorldController(WondersOfWorldService wondersOfWorldService){
        this.wondersOfWorldService = wondersOfWorldService;
    }
    @CrossOrigin("*")
    @GetMapping("/all")
    public List<WondersOfWorld> all() {
        return wondersOfWorldService.all();
    }
    @CrossOrigin("*")
    @PostMapping("/create")
    public WondersOfWorld add(@RequestBody  WondersOfWorld wondersOfWorld){
        return wondersOfWorldService.save(wondersOfWorld);
    }
    @CrossOrigin("*")
    @PutMapping("/{id}")
    public Optional<WondersOfWorld> replaceWonder(@RequestBody WondersOfWorld newWonder, @PathVariable Integer id) {

        return wondersOfWorldService.findById(id)
                .map(wonder -> {
                    wonder.setName(newWonder.getName());
                    wonder.setLocation(newWonder.getLocation());
                    return wondersOfWorldService.save(wonder);
                });
    }

    @CrossOrigin("*")
    @DeleteMapping("/{id}")
    void deleteWonder(@PathVariable Integer id) {
        wondersOfWorldService.deleteById(id);
    }
}


