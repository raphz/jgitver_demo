package com.sweeney.maven_git_release_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

  @Value("${application.version}")
  private String version;

  @RequestMapping("/")
  public String returnAppVersion() {
    return version;
  }
}
