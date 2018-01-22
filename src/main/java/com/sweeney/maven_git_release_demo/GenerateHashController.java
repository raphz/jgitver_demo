package com.sweeney.maven_git_release_demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
public class GenerateHashController {

    @RequestMapping("/hash/{input}")
    public GeneratedHash generatedHash(@PathVariable("input") String input) {
        try {
            // Create a hash of the input string using SHA-256
            return new GeneratedHash(DatatypeConverter.printHexBinary(
                    MessageDigest.getInstance("SHA-256").digest(input.getBytes("UTF-8"))));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new HashGenerationException(String.format("Hash generation failed for input: %s", input), e);
        }
    }
}
