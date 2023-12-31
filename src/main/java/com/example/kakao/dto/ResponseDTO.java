package com.example.kakao.dto;

import lombok.*;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ResponseDTO {
    String uri;
    List<Mess> text;
}
