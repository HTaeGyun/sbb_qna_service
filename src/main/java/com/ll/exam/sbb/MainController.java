package com.ll.exam.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class MainController {

  @RequestMapping("/sbb")
  // 아래 함수의 리턴값을 그대로 부라우저에 표시
  // 아래 함수의 리턴값을 문자열화 해서 브라우저 응답을 바디에 담는다.
  @ResponseBody
  public String index() {
    return "jkls234234324dft45df.";
  }


  @GetMapping("/page1")
  @ResponseBody
  public String showGet() {
    return """
          <form method="POST" action="/page2">
          <input type="number" name="age" placeholder="나이 입력" />
          <input type="submit" value="page1로 POST 방식으로 이동" />
        </from>

        """;
  }

  @PostMapping("/page2")
  @ResponseBody
  public String showPage2Post(@RequestParam(defaultValue = "0") int age) {
    return """
        <h1>입력된 나이 : %d</h1>
        <h1>안녕하세요. POST 방식으로 오신걸 환영합니다.</h1>

        """.formatted(age);
  }

  @GetMapping("/page2")
  @ResponseBody
  public String showPage2Get(@RequestParam(defaultValue = "0") int age) {
    return """
        <h1>입력된 나이 : %d</h1>
        <h1>안녕하세요. POST 방식으로 오신걸 환영합니다.</h1>

        """.formatted(age);
  }
}