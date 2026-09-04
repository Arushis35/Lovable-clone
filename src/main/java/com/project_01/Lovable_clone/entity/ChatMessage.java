package com.project_01.Lovable_clone.entity;

import com.project_01.Lovable_clone.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;
    ChatSession chatSession;

    String content;

    MessageRole messageRole;

    String toolCalls; //JSON Array of Tools Called

    Integer tokensUsed;

    Integer createdAt;


}
