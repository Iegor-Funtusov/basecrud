package ua.com.alevel.basecrud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.alevel.basecrud.service.EncriptService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Iehor Funtusov, created 06/11/2020 - 8:35 PM
 */

@Controller
@RequestMapping("encript")
public class EncriptController {

    private final EncriptService encriptService;

    private List<Integer> list = new ArrayList<>();
    private Set<Integer> set = new TreeSet<>();

    public EncriptController(EncriptService encriptService) {
        this.encriptService = encriptService;
    }

    @GetMapping
    public String encript() {
        return "encript";
    }

    @PostMapping("/encode")
    public ResponseEntity<String> encode(@RequestBody String encode) {
        return ResponseEntity.ok(encriptService.encript(encode));
    }

    @PostMapping("/decode")
    public ResponseEntity<String> decode(@RequestBody String decode) {
        return ResponseEntity.ok(encriptService.decript(decode));
    }

    @PostMapping("/treeset")
    public ResponseEntity<Set<Integer>> treeSet(@RequestBody Integer val) {
        set.add(val);
        return ResponseEntity.ok(set);
    }

    @PostMapping("/arraylist")
    public ResponseEntity<List<Integer>> arrayList(@RequestBody Integer val) {
        list.add(val);
        return ResponseEntity.ok(list);
    }
}
