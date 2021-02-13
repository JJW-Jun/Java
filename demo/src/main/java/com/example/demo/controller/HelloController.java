//package com.example.demo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class HelloController {
//    Service service;
//    @GetMapping("hello")
//    public Person hello(Model model){
//        model.addAttribute("data", "스프링!!");
//        return "hello";
//    }
//
//    @GetMapping("hello-mvc")
//    // 기본이 true
//    // http://localhost:8080//hello-mvc?name=spring!
//    public Person helloMVC(@RequestParam(name="name", required = true) Person name, Model model){
//        model.addAttribute("name", name);
//        return "hello-template";
//    }
//
//    @GetMapping("hello-string")
//    @ResponseBody
//    //http에서 body부에 이것을 직접 넣ㅇ주겠다.
//    public Person helloString(@RequestParam("name") Person name){
//        return "hello" + name;
//    }
//
//    //json으로 반환한다.
//    @GetMapping("hello-api")
//    @ResponseBody
//    // Responsebody가 있으면 객체가 오면 기본 Json방식으로 만들어서 그것을 반환하겠다 라는 정책.
//    public Hello helloApi(@RequestParam("name") Person name){
//        // cmd shift end
//        Hello hello = new Hello();
//        hello.setName(name);
//        return hello;
//
//    }
//
//    // 자바 bean 표준방식, property접근방식
////    static class Hello{
////        private String name;
////
////        public String getName(){
////            return name;
////        }
////
////        public void setName(String name){
////
////        }
////    }
////
//
//
//    // 자바 bean 표준방식, property접근방식
//    static class Hello{
//        private Person name;
//
//        public Person getName(){
//            return name;
//        }
//
//        public void setName(Person name){
//
//        }
//    }
//}
