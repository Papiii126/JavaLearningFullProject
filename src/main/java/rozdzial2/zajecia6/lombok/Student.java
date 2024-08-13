package rozdzial2.zajecia6.lombok;

import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
public class Student {
    private String name;
    private String sureName;
}
