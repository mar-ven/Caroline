package com.vtis.carolinetest.entities;

public class Answer {
    private final String text;
    private final int action_code;
    private final int code_lang = DEFAULT_LANG;
    public static final int DEFAULT_LANG = 0;

    public Answer(String text, int action_code) {
        this.text = text;
        this.action_code = action_code;
    }

    public String getText() {
        return text;
    }

    public int getAction_code() {
        return action_code;
    }

    public int getCode_lang() {
        return code_lang;
    }
}
