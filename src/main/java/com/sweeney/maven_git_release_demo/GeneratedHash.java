package com.sweeney.maven_git_release_demo;

import java.io.Serializable;

public class GeneratedHash implements Serializable {

    private static final long serialVersionUID = 7413407549115971693L;
    private String hash;

    public GeneratedHash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }
}
