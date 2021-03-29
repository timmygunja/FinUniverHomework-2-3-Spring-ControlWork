package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.entity.User;
import com.example.demo.entity.Work;
import com.example.demo.service.CategoryService;
import com.example.demo.service.UserService;
import com.example.demo.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestApiController {
    private final CategoryService categoryService;
    private final UserService userService;
    private final WorkService workService;

    @Autowired
    public RestApiController(CategoryService categoryService, UserService userService, WorkService workService){
        this.categoryService = categoryService;
        this.userService = userService;
        this.workService = workService;
    }

    //  CATEGORY
    @PostMapping(value = "/api/category")
    public ResponseEntity<?> createCategory(@RequestBody Category category){
        categoryService.create(category);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/category")
    public ResponseEntity<List<Category>> findAllCategories(){
        final List<Category> categoryList = categoryService.findAll();

        return categoryList != null && !categoryList.isEmpty()
                ? new ResponseEntity<>(categoryList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/api/category/{id}")
    public ResponseEntity<Category> findCategory(@PathVariable(name="id") Long id){
        final Category category = categoryService.find(id);

        return category != null
                ? new ResponseEntity<>(category, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    //  USER
    @PostMapping(value = "/api/user")
    public ResponseEntity<?> createUser(@RequestBody User user){
        userService.create(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/user")
    public ResponseEntity<List<User>> findAllUsers(){
        final List<User> userList = userService.findAll();

        return userList != null && !userList.isEmpty()
                ? new ResponseEntity<>(userList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/api/user/{id}")
    public ResponseEntity<User> findUser(@PathVariable(name="id") Long id){
        final User user = userService.find(id);

        return user != null
                ? new ResponseEntity<>(user, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    //  WORK
    @PostMapping(value = "/api/work")
    public ResponseEntity<?> createWork(@RequestBody Work work){
        workService.create(work);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/work")
    public ResponseEntity<List<Work>> findAllWorks(){
        final List<Work> workList = workService.findAll();

        return workList != null && !workList.isEmpty()
                ? new ResponseEntity<>(workList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/api/work/{id}")
    public ResponseEntity<Work> findWork(@PathVariable(name="id") Long id){
        final Work work = workService.find(id);

        return work != null
                ? new ResponseEntity<>(work, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
