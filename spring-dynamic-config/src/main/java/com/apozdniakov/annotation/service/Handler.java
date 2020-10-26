package com.apozdniakov.annotation.service;

import java.util.List;

public interface Handler {
    List<String> handle(List<String> input);
}
